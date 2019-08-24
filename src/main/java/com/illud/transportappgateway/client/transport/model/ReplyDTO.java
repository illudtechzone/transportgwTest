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
 * ReplyDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-24T10:31:22.496+05:30[Asia/Kolkata]")

public class ReplyDTO   {
  @JsonProperty("iDPcode")
  private String iDPcode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("repliedDate")
  private OffsetDateTime repliedDate = null;

  @JsonProperty("reply")
  private String reply = null;

  @JsonProperty("reviewId")
  private Long reviewId = null;

  public ReplyDTO iDPcode(String iDPcode) {
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

  public ReplyDTO id(Long id) {
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

  public ReplyDTO repliedDate(OffsetDateTime repliedDate) {
    this.repliedDate = repliedDate;
    return this;
  }

  /**
   * Get repliedDate
   * @return repliedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRepliedDate() {
    return repliedDate;
  }

  public void setRepliedDate(OffsetDateTime repliedDate) {
    this.repliedDate = repliedDate;
  }

  public ReplyDTO reply(String reply) {
    this.reply = reply;
    return this;
  }

  /**
   * Get reply
   * @return reply
  **/
  @ApiModelProperty(value = "")


  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  public ReplyDTO reviewId(Long reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * Get reviewId
   * @return reviewId
  **/
  @ApiModelProperty(value = "")


  public Long getReviewId() {
    return reviewId;
  }

  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyDTO replyDTO = (ReplyDTO) o;
    return Objects.equals(this.iDPcode, replyDTO.iDPcode) &&
        Objects.equals(this.id, replyDTO.id) &&
        Objects.equals(this.repliedDate, replyDTO.repliedDate) &&
        Objects.equals(this.reply, replyDTO.reply) &&
        Objects.equals(this.reviewId, replyDTO.reviewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iDPcode, id, repliedDate, reply, reviewId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyDTO {\n");
    
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repliedDate: ").append(toIndentedString(repliedDate)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
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

