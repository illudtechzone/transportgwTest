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
 * RateAndReview
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-20T12:50:00.241+05:30[Asia/Kolkata]")

public class RateAndReview   {
  @JsonProperty("trackingId")
  private String trackingId = null;

  public RateAndReview trackingId(String trackingId) {
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
    RateAndReview rateAndReview = (RateAndReview) o;
    return Objects.equals(this.trackingId, rateAndReview.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateAndReview {\n");
    
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

