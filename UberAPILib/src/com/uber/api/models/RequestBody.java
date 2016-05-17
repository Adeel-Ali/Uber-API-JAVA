/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/17/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RequestBody 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5464257042772479689L;
    private double endLatitude;
    private double endLongitude;
    private String productId;
    private double startLatitude;
    private double startLongitude;
    private String surgeConfirmationId;
    /** GETTER
     * The final or destination latitude.
     */
    @JsonGetter("end_latitude")
    public double getEndLatitude ( ) { 
        return this.endLatitude;
    }
    
    /** SETTER
     * The final or destination latitude.
     */
    @JsonSetter("end_latitude")
    public void setEndLatitude (double value) { 
        this.endLatitude = value;
    }
 
    /** GETTER
     * The final or destination longitude.
     */
    @JsonGetter("end_longitude")
    public double getEndLongitude ( ) { 
        return this.endLongitude;
    }
    
    /** SETTER
     * The final or destination longitude.
     */
    @JsonSetter("end_longitude")
    public void setEndLongitude (double value) { 
        this.endLongitude = value;
    }
 
    /** GETTER
     * The unique ID of the product being requested.
     */
    @JsonGetter("product_id")
    public String getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * The unique ID of the product being requested.
     */
    @JsonSetter("product_id")
    public void setProductId (String value) { 
        this.productId = value;
    }
 
    /** GETTER
     * The beginning or "pickup" latitude.
     */
    @JsonGetter("start_latitude")
    public double getStartLatitude ( ) { 
        return this.startLatitude;
    }
    
    /** SETTER
     * The beginning or "pickup" latitude.
     */
    @JsonSetter("start_latitude")
    public void setStartLatitude (double value) { 
        this.startLatitude = value;
    }
 
    /** GETTER
     * The beginning or "pickup" longitude.
     */
    @JsonGetter("start_longitude")
    public double getStartLongitude ( ) { 
        return this.startLongitude;
    }
    
    /** SETTER
     * The beginning or "pickup" longitude.
     */
    @JsonSetter("start_longitude")
    public void setStartLongitude (double value) { 
        this.startLongitude = value;
    }
 
    /** GETTER
     * The unique identifier of the surge session for a user. Required when returned from a 409 Conflict response on previous POST attempt.
     */
    @JsonGetter("surge_confirmation_id")
    public String getSurgeConfirmationId ( ) { 
        return this.surgeConfirmationId;
    }
    
    /** SETTER
     * The unique identifier of the surge session for a user. Required when returned from a 409 Conflict response on previous POST attempt.
     */
    @JsonSetter("surge_confirmation_id")
    public void setSurgeConfirmationId (String value) { 
        this.surgeConfirmationId = value;
    }
 
}
 