/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class History 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5192813250351941829L;
    private double distance;
    private Location endLocation;
    private int endTime;
    private String productId;
    private int requestTime;
    private Location startLocation;
    private int startTime;
    private String status;
    private String uuid;
    /** GETTER
     * Distance travelled
     */
    @JsonGetter("distance")
    public double getDistance ( ) { 
        return this.distance;
    }
    
    /** SETTER
     * Distance travelled
     */
    @JsonSetter("distance")
    public void setDistance (double value) { 
        this.distance = value;
    }
 
    /** GETTER
     * Location where journey ended
     */
    @JsonGetter("end_location")
    public Location getEndLocation ( ) { 
        return this.endLocation;
    }
    
    /** SETTER
     * Location where journey ended
     */
    @JsonSetter("end_location")
    public void setEndLocation (Location value) { 
        this.endLocation = value;
    }
 
    /** GETTER
     * Time of journey end
     */
    @JsonGetter("end_time")
    public int getEndTime ( ) { 
        return this.endTime;
    }
    
    /** SETTER
     * Time of journey end
     */
    @JsonSetter("end_time")
    public void setEndTime (int value) { 
        this.endTime = value;
    }
 
    /** GETTER
     * The product that was used
     */
    @JsonGetter("product_id")
    public String getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * The product that was used
     */
    @JsonSetter("product_id")
    public void setProductId (String value) { 
        this.productId = value;
    }
 
    /** GETTER
     * Time when requested
     */
    @JsonGetter("request_time")
    public int getRequestTime ( ) { 
        return this.requestTime;
    }
    
    /** SETTER
     * Time when requested
     */
    @JsonSetter("request_time")
    public void setRequestTime (int value) { 
        this.requestTime = value;
    }
 
    /** GETTER
     * Location of starting the journey
     */
    @JsonGetter("start_location")
    public Location getStartLocation ( ) { 
        return this.startLocation;
    }
    
    /** SETTER
     * Location of starting the journey
     */
    @JsonSetter("start_location")
    public void setStartLocation (Location value) { 
        this.startLocation = value;
    }
 
    /** GETTER
     * Time of starting the journey
     */
    @JsonGetter("start_time")
    public int getStartTime ( ) { 
        return this.startTime;
    }
    
    /** SETTER
     * Time of starting the journey
     */
    @JsonSetter("start_time")
    public void setStartTime (int value) { 
        this.startTime = value;
    }
 
    /** GETTER
     * Status of the product e.g., completed
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status of the product e.g., completed
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * History item id
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * History item id
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
}
 