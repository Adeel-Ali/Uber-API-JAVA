/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/17/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ErrorBase 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5034305407842212692L;
    private List<Errors> errors;
    private String meta;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("errors")
    public List<Errors> getErrors ( ) { 
        return this.errors;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("errors")
    public void setErrors (List<Errors> value) { 
        this.errors = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meta")
    public String getMeta ( ) { 
        return this.meta;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meta")
    public void setMeta (String value) { 
        this.meta = value;
    }
 
}
 