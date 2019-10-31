/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.transportappgateway.client.transport.api;

import com.illud.transportappgateway.client.transport.model.RideDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-31T11:20:40.294+05:30[Asia/Calcutta]")

@Api(value = "RideResource", description = "the RideResource API")
public interface RideResourceApi {

    @ApiOperation(value = "createRide", nickname = "createRideUsingPOST", notes = "", response = RideDTO.class, tags={ "ride-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RideDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rides",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RideDTO> createRideUsingPOST(@ApiParam(value = "rideDTO" ,required=true )  @Valid @RequestBody RideDTO rideDTO);


    @ApiOperation(value = "deleteRide", nickname = "deleteRideUsingDELETE", notes = "", tags={ "ride-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/rides/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteRideUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllRides", nickname = "getAllRidesUsingGET", notes = "", response = RideDTO.class, responseContainer = "List", tags={ "ride-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RideDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rides",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RideDTO>> getAllRidesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getRide", nickname = "getRideUsingGET", notes = "", response = RideDTO.class, tags={ "ride-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RideDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rides/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RideDTO> getRideUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchRides", nickname = "searchRidesUsingGET", notes = "", response = RideDTO.class, responseContainer = "List", tags={ "ride-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RideDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/rides",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RideDTO>> searchRidesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateRide", nickname = "updateRideUsingPUT", notes = "", response = RideDTO.class, tags={ "ride-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RideDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rides",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RideDTO> updateRideUsingPUT(@ApiParam(value = "rideDTO" ,required=true )  @Valid @RequestBody RideDTO rideDTO);

}
