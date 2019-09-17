package com.illud.transportappgateway.web.rest;

import java.net.URISyntaxException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.transportappgateway.client.transport.domain.Driver;
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

@RestController
@RequestMapping("/api/command")
public class CommandResource {

	@Autowired
	private CommandService commandService;
	
	

    /**
     * POST  /drivers : Create a new driver.
     *
     * @param driverDTO the driverDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new driverDTO, or with status 400 (Bad Request) if the driver has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/driver")
    public ResponseEntity<DriverDTO> createDriver(@RequestBody DriverDTO driverDTO) throws URISyntaxException {
		return commandService.createDriver(driverDTO);
    	
    }
    
    @PutMapping("/update/driver")
    public ResponseEntity<DriverDTO> updateDriver(@RequestBody DriverDTO driverDTO) throws URISyntaxException {
		return commandService.updateDriver(driverDTO);
    	
    }
    @PostMapping("/create/driver")
    public ResponseEntity<DriverDTO> createDriverIfNotExist(@RequestBody DriverDTO driverDTO) throws URISyntaxException {
		return commandService.createDriverIfNotExist(driverDTO);
    	
    }
    
    @PostMapping("/create/rider")
    public ResponseEntity<RiderDTO> createRiderIfNotExist(@RequestBody RiderDTO riderDTO) throws URISyntaxException {
		return commandService.createRiderIfNotExist(riderDTO);
    	
    }
	
	//////////////////////////////////transport api////////////////////////////////////////////////////
    
    @PostMapping("/initiate") 
	  public ResponseEntity<String> initateWorkflow() {
	  
		return commandService.initiate();
	  
	
	  
	  }
    
    @PostMapping("/collectRiderLocationDetails/{taskId}")
	public ResponseEntity<Void> collectRiderLocationDetails(@PathVariable String taskId, @RequestBody DefaultInfoRequest defaultInfoRequest)
	{
    	return commandService.collectRiderLocationDetails(taskId,defaultInfoRequest);
	}
    
    @PostMapping("/driverResponse/{taskId}")
    public ResponseEntity<Void> driverResponse(@PathVariable String taskId, @RequestBody DriverInfo driverInfo){
    	
    	return commandService.driverResponse(taskId,driverInfo);
    }
    
    @PostMapping("/startRide/{taskId}")
    public ResponseEntity<Void> startRide(@PathVariable String taskId,@RequestBody RideStatus startRide) {
    	
    	return commandService.startRide(taskId,startRide);
    }
    
    @PostMapping("/rideComplete/{taskId}")
    public ResponseEntity<Void> rideComplete(@PathVariable String taskId,@RequestBody RideStatus rideComplete) {
    	
    	return commandService.rideComplete(taskId,rideComplete);
    }
    
    @PostMapping("/payment/{taskId}")
	 public ResponseEntity<Void> payment(@PathVariable String taskId, @RequestBody PaymentStatus paymentStatus) {
		 
    	return commandService.paymentStatus(taskId,paymentStatus);
	 }
	 
	 
	 @PostMapping("/rateAndReview/{taskId}")
	 public ResponseEntity<Void> rateAndReview(@PathVariable String taskId, @RequestBody RateAndReview rateAndReview) {
		 
		 return commandService.rateAndReview(taskId,rateAndReview);
	 }
	 
	 
	 @PostMapping("/request/driver/{processInstanceId}")
	public ResponseEntity<RideDtoWrapper> sendRequestToDriver(@RequestBody RideDTO rideDto,@PathVariable String processInstanceId ) {
		return commandService.sendRequestToDriver(rideDto,processInstanceId);
		}
	 
	 
	 @PostMapping("/request/customer/{status}")
		public ResponseEntity<RideDtoWrapper> sendStatusToCustomer(@RequestBody RideDTO rideDto,String status ) {
			return commandService.sendStatusToCustomer(rideDto,status);
			}
	 
	 
	 
	
}
	