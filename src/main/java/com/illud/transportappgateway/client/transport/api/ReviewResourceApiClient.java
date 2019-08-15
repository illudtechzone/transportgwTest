package com.illud.transportappgateway.client.transport.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.transportappgateway.client.transport.ClientConfiguration;

@FeignClient(name="${transport.name:transport}", url="${transport.url:35.232.29.128:8081/}", configuration = ClientConfiguration.class)
public interface ReviewResourceApiClient extends ReviewResourceApi {
}