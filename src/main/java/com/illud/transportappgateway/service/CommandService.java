package com.illud.transportappgateway.service;

import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.http.ResponseEntity;

import com.illud.transportappgateway.client.transport.model.DefaultInfoRequest;
import com.illud.transportappgateway.client.transport.model.DriverDTO;
import com.illud.transportappgateway.client.transport.model.DriverInfo;
import com.illud.transportappgateway.client.transport.model.InitiateRide;
import com.illud.transportappgateway.client.transport.model.PaymentStatus;
import com.illud.transportappgateway.client.transport.model.RateAndReview;
import com.illud.transportappgateway.client.transport.model.RideStatus;
import com.illud.transportappgateway.client.transport.model.RiderDTO;
import com.illud.transportappgateway.client.transport.model.RiderLocationInfo;


public interface CommandService {

	ResponseEntity<DriverDTO> createDriver(DriverDTO driverDTO);

	ResponseEntity<DriverDTO> updateDriver(DriverDTO driverDTO);

	ResponseEntity<DriverDTO> createDriverIfNotExist(DriverDTO driverDTO);

	ResponseEntity<RiderDTO> createRiderIfNotExist(RiderDTO riderDTO);

	ResponseEntity<RiderDTO> createRider(RiderDTO riderDTO);

	ResponseEntity<RiderDTO> updateRider(RiderDTO riderDTO);
	
////////////////////////////////////////////////transport ///////////////////////////////////////////

	ResponseEntity<String> initiate();
	
	ResponseEntity<Void> driverResponse(String taskId, DriverInfo driverInfo);

	ResponseEntity<Void> startRide(String taskId, RideStatus startRide);

	ResponseEntity<Void> rideComplete(String taskId, RideStatus rideComplete);

	ResponseEntity<Void> paymentStatus(String taskId, PaymentStatus paymentStatus);

	ResponseEntity<Void> rateAndReview(String taskId, RateAndReview rateAndReview);

	ResponseEntity<Void> collectRiderLocationDetails(String taskId, DefaultInfoRequest defaultInfoRequest);

	

	

	
	
	
	
}
