package com.illud.transportappgateway.client.transport.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.transportappgateway.client.transport.ClientConfiguration;

@FeignClient(name="${transport.name:transport}", url="${transport.url}", configuration = ClientConfiguration.class)
public interface TransportQueryResourceApiClient extends TransportQueryResourceApi {
}