package com.illud.transportappgateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.illud.transportappgateway.client.transport.api.DriverResourceApi;
import com.illud.transportappgateway.client.transport.api.RiderResourceApi;
import com.illud.transportappgateway.client.transport.api.TransportCommandResourceApi;
import com.illud.transportappgateway.client.transport.model.DefaultInfoRequest;
import com.illud.transportappgateway.client.transport.model.DriverDTO;
import com.illud.transportappgateway.client.transport.model.DriverInfo;
import com.illud.transportappgateway.client.transport.model.InitiateRide;
import com.illud.transportappgateway.client.transport.model.PaymentStatus;
import com.illud.transportappgateway.client.transport.model.RateAndReview;
import com.illud.transportappgateway.client.transport.model.RideDTO;
import com.illud.transportappgateway.client.transport.model.RideStatus;
import com.illud.transportappgateway.client.transport.model.RiderDTO;
import com.illud.transportappgateway.client.transport.model.RiderLocationInfo;
import com.illud.transportappgateway.domain.RideDtoWrapper;
import com.illud.transportappgateway.service.CommandService;

@Service
@Transactional
public class CommandServiceImpl implements CommandService {
	@Autowired
    private SimpMessagingTemplate messageSender;
	
@Autowired
private DriverResourceApi driverResourceApi;

@Autowired
private RiderResourceApi riderResourceApi;

@Autowired
private TransportCommandResourceApi transportCommandResourceApi;

@Autowired
private CommandService commandService;

	@Override
	public ResponseEntity<DriverDTO> createDriver(DriverDTO driverDTO) {
		
		return driverResourceApi.createDriverUsingPOST(driverDTO);
	}

	@Override
	public ResponseEntity<DriverDTO> updateDriver(DriverDTO driverDTO) {

		return driverResourceApi.updateDriverUsingPUT(driverDTO);
	}

	@Override
	public ResponseEntity<DriverDTO> createDriverIfNotExist(DriverDTO driverDTO) {
	
		return driverResourceApi.createDriverIfnotExistUsingPOST(driverDTO);
	}

	@Override
	public ResponseEntity<RiderDTO> createRiderIfNotExist(RiderDTO riderDTO) {
		
		return riderResourceApi.createriderIfnotExistUsingPOST(riderDTO);
	}

	@Override
	public ResponseEntity<RiderDTO> createRider(RiderDTO riderDTO) {
	
		return riderResourceApi.createRiderUsingPOST(riderDTO);
	}

	@Override
	public ResponseEntity<RiderDTO> updateRider(RiderDTO riderDTO) {
		
		return riderResourceApi.updateRiderUsingPUT(riderDTO);
	}

	
////////////////////////////////////////////////transport ///////////////////////////////////////////
	
	@Override
	public ResponseEntity<String> initiate() {
		return transportCommandResourceApi.initateWorkflowUsingPOST();
	}
	
	@Override
	public ResponseEntity<Void> collectRiderLocationDetails(String taskId, DefaultInfoRequest defaultInfoRequest) {
		
		return transportCommandResourceApi.collectRiderLocationDetailsUsingPOST(taskId, defaultInfoRequest);
	}
	
	@Override
	public ResponseEntity<Void> driverResponse(String taskId, DriverInfo driverInfo) {
		
		return transportCommandResourceApi.driverResponseUsingPOST(taskId, driverInfo);
		
	}

	@Override
	public ResponseEntity<Void> startRide(String taskId, RideStatus startRide) {
		
		return transportCommandResourceApi.startRideUsingPOST(taskId, startRide);
	}

	@Override
	public ResponseEntity<Void> rideComplete(String taskId, RideStatus rideComplete) {
		
		return transportCommandResourceApi.rideCompleteUsingPOST(taskId, rideComplete);
	}

	@Override
	public ResponseEntity<Void> paymentStatus(String taskId, PaymentStatus paymentStatus) {
		
		return transportCommandResourceApi.paymentUsingPOST(taskId, paymentStatus);
		
	}

	@Override
	public ResponseEntity<Void> rateAndReview(String taskId, RateAndReview rateAndReview) {
		
		return transportCommandResourceApi.rateAndReviewUsingPOST(taskId, rateAndReview);
		
	}

	@Override
	public ResponseEntity<RideDtoWrapper> sendRequestToDriver(RideDTO rideDto,String processInstanceId) {
		RideDtoWrapper rideDtoWrapper=new RideDtoWrapper();
		rideDtoWrapper.setRideDTO(rideDto);
		rideDtoWrapper.setProcessInstanceId(processInstanceId);
		messageSender.convertAndSendToUser(rideDto.getDriverId(), "/topic/reply",rideDtoWrapper );
		return ResponseEntity.ok().body(rideDtoWrapper);
	}
	
	
	
	
	
	public ResponseEntity<RideDtoWrapper> getRideWrapper(RideDtoWrapper rdw) {
				return ResponseEntity.ok().body(rdw);

	}

	@Override
	public ResponseEntity<RideDtoWrapper> sendStatusToCustomer(RideDTO rideDto, String status) {
		RideDtoWrapper rideDtoWrapper=new RideDtoWrapper();
		rideDtoWrapper.setRideDTO(rideDto);
		rideDtoWrapper.setStatus(status);
		messageSender.convertAndSendToUser(rideDto.getRiderId(), "/topic/review",rideDtoWrapper );
		
		
		return null;
	}
	
	

}
 