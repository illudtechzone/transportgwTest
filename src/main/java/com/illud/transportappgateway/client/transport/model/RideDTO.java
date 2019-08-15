package com.illud.transportappgateway.client.transport.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RideDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-14T15:05:14.796+05:30[Asia/Kolkata]")

public class RideDTO   {
  @JsonProperty("addressDestination")
  private String addressDestination = null;

  @JsonProperty("addressStartingPoint")
  private String addressStartingPoint = null;

  @JsonProperty("driverId")
  private String driverId = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("fare")
  private Double fare = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("riderId")
  private String riderId = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("totalDistance")
  private Double totalDistance = null;

  public RideDTO addressDestination(String addressDestination) {
    this.addressDestination = addressDestination;
    return this;
  }

  /**
   * Get addressDestination
   * @return addressDestination
  **/
  @ApiModelProperty(value = "")


  public String getAddressDestination() {
    return addressDestination;
  }

  public void setAddressDestination(String addressDestination) {
    this.addressDestination = addressDestination;
  }

  public RideDTO addressStartingPoint(String addressStartingPoint) {
    this.addressStartingPoint = addressStartingPoint;
    return this;
  }

  /**
   * Get addressStartingPoint
   * @return addressStartingPoint
  **/
  @ApiModelProperty(value = "")


  public String getAddressStartingPoint() {
    return addressStartingPoint;
  }

  public void setAddressStartingPoint(String addressStartingPoint) {
    this.addressStartingPoint = addressStartingPoint;
  }

  public RideDTO driverId(String driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Get driverId
   * @return driverId
  **/
  @ApiModelProperty(value = "")


  public String getDriverId() {
    return driverId;
  }

  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  public RideDTO endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public RideDTO fare(Double fare) {
    this.fare = fare;
    return this;
  }

  /**
   * Get fare
   * @return fare
  **/
  @ApiModelProperty(value = "")


  public Double getFare() {
    return fare;
  }

  public void setFare(Double fare) {
    this.fare = fare;
  }

  public RideDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RideDTO riderId(String riderId) {
    this.riderId = riderId;
    return this;
  }

  /**
   * Get riderId
   * @return riderId
  **/
  @ApiModelProperty(value = "")


  public String getRiderId() {
    return riderId;
  }

  public void setRiderId(String riderId) {
    this.riderId = riderId;
  }

  public RideDTO startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public RideDTO totalDistance(Double totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

  /**
   * Get totalDistance
   * @return totalDistance
  **/
  @ApiModelProperty(value = "")


  public Double getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Double totalDistance) {
    this.totalDistance = totalDistance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideDTO rideDTO = (RideDTO) o;
    return Objects.equals(this.addressDestination, rideDTO.addressDestination) &&
        Objects.equals(this.addressStartingPoint, rideDTO.addressStartingPoint) &&
        Objects.equals(this.driverId, rideDTO.driverId) &&
        Objects.equals(this.endTime, rideDTO.endTime) &&
        Objects.equals(this.fare, rideDTO.fare) &&
        Objects.equals(this.id, rideDTO.id) &&
        Objects.equals(this.riderId, rideDTO.riderId) &&
        Objects.equals(this.startTime, rideDTO.startTime) &&
        Objects.equals(this.totalDistance, rideDTO.totalDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDestination, addressStartingPoint, driverId, endTime, fare, id, riderId, startTime, totalDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideDTO {\n");
    
    sb.append("    addressDestination: ").append(toIndentedString(addressDestination)).append("\n");
    sb.append("    addressStartingPoint: ").append(toIndentedString(addressStartingPoint)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    fare: ").append(toIndentedString(fare)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    riderId: ").append(toIndentedString(riderId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalDistance: ").append(toIndentedString(totalDistance)).append("\n");
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

