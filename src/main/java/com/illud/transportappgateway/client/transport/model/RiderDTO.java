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
 * RiderDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-14T15:05:14.796+05:30[Asia/Kolkata]")

public class RiderDTO   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("iDPcode")
  private String iDPcode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("mobilenumber")
  private String mobilenumber = null;

  public RiderDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RiderDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public RiderDTO iDPcode(String iDPcode) {
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

  public RiderDTO id(Long id) {
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

  public RiderDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public RiderDTO mobilenumber(String mobilenumber) {
    this.mobilenumber = mobilenumber;
    return this;
  }

  /**
   * Get mobilenumber
   * @return mobilenumber
  **/
  @ApiModelProperty(value = "")


  public String getMobilenumber() {
    return mobilenumber;
  }

  public void setMobilenumber(String mobilenumber) {
    this.mobilenumber = mobilenumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiderDTO riderDTO = (RiderDTO) o;
    return Objects.equals(this.email, riderDTO.email) &&
        Objects.equals(this.firstName, riderDTO.firstName) &&
        Objects.equals(this.iDPcode, riderDTO.iDPcode) &&
        Objects.equals(this.id, riderDTO.id) &&
        Objects.equals(this.lastName, riderDTO.lastName) &&
        Objects.equals(this.mobilenumber, riderDTO.mobilenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, iDPcode, id, lastName, mobilenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiderDTO {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    iDPcode: ").append(toIndentedString(iDPcode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobilenumber: ").append(toIndentedString(mobilenumber)).append("\n");
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

