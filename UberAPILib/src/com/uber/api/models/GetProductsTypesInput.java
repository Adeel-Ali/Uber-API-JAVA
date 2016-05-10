/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/10/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetProductsTypesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5445096149673151856L;
    private double latitude;
    private double longitude;
    /** GETTER
     * Latitude component of location.
     */
    @JsonGetter("latitude")
    public double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * Latitude component of location.
     */
    @JsonSetter("latitude")
    public void setLatitude (double value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * Longitude component of location.
     */
    @JsonGetter("longitude")
    public double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * Longitude component of location.
     */
    @JsonSetter("longitude")
    public void setLongitude (double value) { 
        this.longitude = value;
    }
 
}
 