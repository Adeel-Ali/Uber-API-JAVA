/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TimeEstimate 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5460023249579169803L;
    private String displayName;
    private int estimate;
    private String productId;
    /** GETTER
     * Display name of product.
     */
    @JsonGetter("display_name")
    public String getDisplayName ( ) { 
        return this.displayName;
    }
    
    /** SETTER
     * Display name of product.
     */
    @JsonSetter("display_name")
    public void setDisplayName (String value) { 
        this.displayName = value;
    }
 
    /** GETTER
     * ETA for the product (in seconds). Always show estimate in minutes.
     */
    @JsonGetter("estimate")
    public int getEstimate ( ) { 
        return this.estimate;
    }
    
    /** SETTER
     * ETA for the product (in seconds). Always show estimate in minutes.
     */
    @JsonSetter("estimate")
    public void setEstimate (int value) { 
        this.estimate = value;
    }
 
    /** GETTER
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @JsonGetter("product_id")
    public String getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @JsonSetter("product_id")
    public void setProductId (String value) { 
        this.productId = value;
    }
 
}
 