/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SurgeConfirmation 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5353284394094676589L;
    private String href;
    private String surgeConfirmationId;
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
    @JsonGetter("surge_confirmation_id")
    public String getSurgeConfirmationId ( ) { 
        return this.surgeConfirmationId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("surge_confirmation_id")
    public void setSurgeConfirmationId (String value) { 
        this.surgeConfirmationId = value;
    }
 
}
 