package com.illud.transportappgateway.client.transport.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.transportappgateway.client.transport.ClientConfiguration;

@FeignClient(name="${transport.name:transport}", url="${transport.url:35.239.128.233:8081/}", configuration = ClientConfiguration.class)
public interface RideResourceApiClient extends RideResourceApi {
}