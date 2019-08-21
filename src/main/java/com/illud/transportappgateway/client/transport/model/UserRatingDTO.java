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
 * UserRatingDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-21T12:16:18.895+05:30[Asia/Kolkata]")

public class UserRatingDTO   {
  @JsonProperty("driverId")
  private Long driverId = null;

  @JsonProperty("iDPcode")
  private String iDPcode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("ratedOn")
  private OffsetDateTime ratedOn = null;

  @JsonProperty("rating")
  private Double rating = null;

  public UserRatingDTO driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Get driverId
   * @return driverId
  **/
  @ApiModelProperty(value = "")


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public UserRatingDTO iDPcode(String iDPcode) {
    this.iDPcode = iDPcode;
    return this;
  }

  /**
   * Get iDPcode
   * @return iDPcode
  **/
  @ApiModelProperty(value = "")


  public String getIDPcode() {
    return iDPcode;
  }

  public void setIDPcode(String iDPcode) {
    this.iDPcode = iDPcode;
  }

  public UserRatingDTO id(Long id) {
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

  public UserRatingDTO ratedOn(OffsetDateTime ratedOn) {
    this.ratedOn = ratedOn;
    return this;
  }

  /**
   * Get ratedOn
   * @return ratedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRatedOn() {
    return ratedOn;
  }

  public void setRatedOn(OffsetDateTime ratedOn) {
    this.ratedOn = ratedOn;
  }

  public UserRatingDTO rating(Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRatingDTO userRatingDTO = (UserRatingDTO) o;
    return Objects.equals(this.driverId, userRatingDTO.driverId) &&
        Objects.equals(this.iDPcode, userRatingDTO.iDPcode) &&
        Objects.equals(this.id, userRatingDTO.id) &&
        Objects.equals(this.ratedOn, userRatingDTO.ratedOn) &&
        Objects.equals(this.rating, userRatingDTO.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, iDPcode, id, ratedOn, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingDTO {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedOn: ").append(toIndentedString(ratedOn)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

