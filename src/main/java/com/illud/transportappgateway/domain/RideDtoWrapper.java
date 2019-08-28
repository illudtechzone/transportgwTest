package com.illud.transportappgateway.domain;

import com.illud.transportappgateway.client.transport.model.RideDTO;

public class RideDtoWrapper {
	private RideDTO rideDTO;
	private String processInstanceId;

	public RideDTO getRideDTO() {
		return rideDTO;
	}

	public void setRideDTO(RideDTO rideDTO) {
		this.rideDTO = rideDTO;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

}
