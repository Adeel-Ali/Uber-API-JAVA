/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Request 
        extends ErrorBase {
    private static final long serialVersionUID = 4628597642915264616L;
    private LinkedHashMap<String, Object> driver;
    private int eta;
    private LinkedHashMap<String, Object> location;
    private String requestId;
    private String status;
    private double surgeMultiplier;
    private LinkedHashMap<String, Object> vehicle;
    /** GETTER
     * The object that contains driver details.
     */
    @JsonGetter("driver")
    public LinkedHashMap<String, Object> getDriver ( ) { 
        return this.driver;
    }
    
    /** SETTER
     * The object that contains driver details.
     */
    @JsonSetter("driver")
    public void setDriver (LinkedHashMap<String, Object> value) { 
        this.driver = value;
    }
 
    /** GETTER
     * The estimated time of vehicle arrival in minutes.
     */
    @JsonGetter("eta")
    public int getEta ( ) { 
        return this.eta;
    }
    
    /** SETTER
     * The estimated time of vehicle arrival in minutes.
     */
    @JsonSetter("eta")
    public void setEta (int value) { 
        this.eta = value;
    }
 
    /** GETTER
     * The object that contains the location information of the vehicle and driver
     */
    @JsonGetter("location")
    public LinkedHashMap<String, Object> getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * The object that contains the location information of the vehicle and driver
     */
    @JsonSetter("location")
    public void setLocation (LinkedHashMap<String, Object> value) { 
        this.location = value;
    }
 
    /** GETTER
     * The unique ID of the Request.
     */
    @JsonGetter("request_id")
    public String getRequestId ( ) { 
        return this.requestId;
    }
    
    /** SETTER
     * The unique ID of the Request.
     */
    @JsonSetter("request_id")
    public void setRequestId (String value) { 
        this.requestId = value;
    }
 
    /** GETTER
     * The status of the Request indicating state.
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of the Request indicating state.
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * The surge pricing multiplier used to calculate the increased price of a Request. A multiplier of 1.0 means surge pricing is not in effect.
     */
    @JsonGetter("surge_multiplier")
    public double getSurgeMultiplier ( ) { 
        return this.surgeMultiplier;
    }
    
    /** SETTER
     * The surge pricing multiplier used to calculate the increased price of a Request. A multiplier of 1.0 means surge pricing is not in effect.
     */
    @JsonSetter("surge_multiplier")
    public void setSurgeMultiplier (double value) { 
        this.surgeMultiplier = value;
    }
 
    /** GETTER
     * The object that contains vehicle details.
     */
    @JsonGetter("vehicle")
    public LinkedHashMap<String, Object> getVehicle ( ) { 
        return this.vehicle;
    }
    
    /** SETTER
     * The object that contains vehicle details.
     */
    @JsonSetter("vehicle")
    public void setVehicle (LinkedHashMap<String, Object> value) { 
        this.vehicle = value;
    }
 
}
 