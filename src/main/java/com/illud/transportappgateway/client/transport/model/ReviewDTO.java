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
 * ReviewDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-24T10:31:22.496+05:30[Asia/Kolkata]")

public class ReviewDTO   {
  @JsonProperty("driverId")
  private Long driverId = null;

  @JsonProperty("iDPcode")
  private String iDPcode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("review")
  private String review = null;

  @JsonProperty("reviewedDate")
  private OffsetDateTime reviewedDate = null;

  public ReviewDTO driverId(Long driverId) {
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

  public ReviewDTO iDPcode(String iDPcode) {
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

  public ReviewDTO id(Long id) {
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

  public ReviewDTO review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")


  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public ReviewDTO reviewedDate(OffsetDateTime reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }

  /**
   * Get reviewedDate
   * @return reviewedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getReviewedDate() {
    return reviewedDate;
  }

  public void setReviewedDate(OffsetDateTime reviewedDate) {
    this.reviewedDate = reviewedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewDTO reviewDTO = (ReviewDTO) o;
    return Objects.equals(this.driverId, reviewDTO.driverId) &&
        Objects.equals(this.iDPcode, reviewDTO.iDPcode) &&
        Objects.equals(this.id, reviewDTO.id) &&
        Objects.equals(this.review, reviewDTO.review) &&
        Objects.equals(this.reviewedDate, reviewDTO.reviewedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, iDPcode, id, review, reviewedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewDTO {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
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

