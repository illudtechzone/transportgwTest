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
 * OpenBookings
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-18T12:53:56+05:30[Asia/Kolkata]")

public class OpenBookings   {
  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("distance")
  private String distance = null;

  @JsonProperty("pickUp")
  private String pickUp = null;

  @JsonProperty("trackingProcessinstanceId")
  private String trackingProcessinstanceId = null;

  public OpenBookings destination(String destination) {
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

  public OpenBookings distance(String distance) {
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

  public OpenBookings pickUp(String pickUp) {
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

  public OpenBookings trackingProcessinstanceId(String trackingProcessinstanceId) {
    this.trackingProcessinstanceId = trackingProcessinstanceId;
    return this;
  }

  /**
   * Get trackingProcessinstanceId
   * @return trackingProcessinstanceId
  **/
  @ApiModelProperty(value = "")


  public String getTrackingProcessinstanceId() {
    return trackingProcessinstanceId;
  }

  public void setTrackingProcessinstanceId(String trackingProcessinstanceId) {
    this.trackingProcessinstanceId = trackingProcessinstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenBookings openBookings = (OpenBookings) o;
    return Objects.equals(this.destination, openBookings.destination) &&
        Objects.equals(this.distance, openBookings.distance) &&
        Objects.equals(this.pickUp, openBookings.pickUp) &&
        Objects.equals(this.trackingProcessinstanceId, openBookings.trackingProcessinstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, distance, pickUp, trackingProcessinstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenBookings {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    pickUp: ").append(toIndentedString(pickUp)).append("\n");
    sb.append("    trackingProcessinstanceId: ").append(toIndentedString(trackingProcessinstanceId)).append("\n");
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

