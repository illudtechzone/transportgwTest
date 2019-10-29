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
 * DefaultInfoRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-29T15:21:49.625+05:30[Asia/Calcutta]")

public class DefaultInfoRequest   {
  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("distance")
  private String distance = null;

  @JsonProperty("pickUp")
  private String pickUp = null;

  public DefaultInfoRequest destination(String destination) {
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

  public DefaultInfoRequest distance(String distance) {
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

  public DefaultInfoRequest pickUp(String pickUp) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultInfoRequest defaultInfoRequest = (DefaultInfoRequest) o;
    return Objects.equals(this.destination, defaultInfoRequest.destination) &&
        Objects.equals(this.distance, defaultInfoRequest.distance) &&
        Objects.equals(this.pickUp, defaultInfoRequest.pickUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, distance, pickUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultInfoRequest {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    pickUp: ").append(toIndentedString(pickUp)).append("\n");
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

