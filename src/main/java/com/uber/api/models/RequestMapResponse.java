/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RequestMapResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5174113388727402988L;
    private String href;
    private String requestId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("href")
    public String getHref ( ) { 
        return this.href;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("href")
    public void setHref (String value) { 
        this.href = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("request_id")
    public String getRequestId ( ) { 
        return this.requestId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("request_id")
    public void setRequestId (String value) { 
        this.requestId = value;
    }
 
}
 