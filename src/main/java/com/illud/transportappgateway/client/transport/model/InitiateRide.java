package com.illud.transportappgateway.client.transport.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateRide
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-18T12:53:56+05:30[Asia/Kolkata]")

public class InitiateRide   {
  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("distance")
  private String distance = null;

  @JsonProperty("pickUp")
  private String pickUp = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public InitiateRide destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public InitiateRide distance(String distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(value = "")


  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public InitiateRide pickUp(String pickUp) {
    this.pickUp = pickUp;
    return this;
  }

  /**
   * Get pickUp
   * @return pickUp
  **/
  @ApiModelProperty(value = "")


  public String getPickUp() {
    return pickUp;
  }

  public void setPickUp(String pickUp) {
    this.pickUp = pickUp;
  }

  public InitiateRide status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InitiateRide trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")


  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateRide initiateRide = (InitiateRide) o;
    return Objects.equals(this.destination, initiateRide.destination) &&
        Objects.equals(this.distance, initiateRide.distance) &&
        Objects.equals(this.pickUp, initiateRide.pickUp) &&
        Objects.equals(this.status, initiateRide.status) &&
        Objects.equals(this.trackingId, initiateRide.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, distance, pickUp, status, trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateRide {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    pickUp: ").append(toIndentedString(pickUp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

