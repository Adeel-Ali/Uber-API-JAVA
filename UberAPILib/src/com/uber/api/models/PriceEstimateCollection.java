/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PriceEstimateCollection 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4755813519586422824L;
    private List<PriceEsitmate> prices;
    /** GETTER
     * List of price estimates
     */
    @JsonGetter("prices")
    public List<PriceEsitmate> getPrices ( ) { 
        return this.prices;
    }
    
    /** SETTER
     * List of price estimates
     */
    @JsonSetter("prices")
    public void setPrices (List<PriceEsitmate> value) { 
        this.prices = value;
    }
 
}
 