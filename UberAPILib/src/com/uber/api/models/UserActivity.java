/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserActivity 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5407993401227354484L;
    private int count;
    private List<History> history;
    private int limit;
    private int offset;
    /** GETTER
     * Total number of items available.
     */
    @JsonGetter("count")
    public int getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * Total number of items available.
     */
    @JsonSetter("count")
    public void setCount (int value) { 
        this.count = value;
    }
 
    /** GETTER
     * Information including the pickup location, dropoff location, request start time, request end time, and distance of requests (in miles), as well as the product type that was requested.
     */
    @JsonGetter("history")
    public List<History> getHistory ( ) { 
        return this.history;
    }
    
    /** SETTER
     * Information including the pickup location, dropoff location, request start time, request end time, and distance of requests (in miles), as well as the product type that was requested.
     */
    @JsonSetter("history")
    public void setHistory (List<History> value) { 
        this.history = value;
    }
 
    /** GETTER
     * Number of items to retrieve (100 max).
     */
    @JsonGetter("limit")
    public int getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * Number of items to retrieve (100 max).
     */
    @JsonSetter("limit")
    public void setLimit (int value) { 
        this.limit = value;
    }
 
    /** GETTER
     * Position in pagination.
     */
    @JsonGetter("offset")
    public int getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * Position in pagination.
     */
    @JsonSetter("offset")
    public void setOffset (int value) { 
        this.offset = value;
    }
 
}
 