/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/10/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Product 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5527502733522626227L;
    private int capacity;
    private String description;
    private String displayName;
    private String image;
    private String productId;
    /** GETTER
     * Capacity of product. For example, 4 people.
     */
    @JsonGetter("capacity")
    public int getCapacity ( ) { 
        return this.capacity;
    }
    
    /** SETTER
     * Capacity of product. For example, 4 people.
     */
    @JsonSetter("capacity")
    public void setCapacity (int value) { 
        this.capacity = value;
    }
 
    /** GETTER
     * Description of product.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description of product.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
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
     * Image URL representing the product.
     */
    @JsonGetter("image")
    public String getImage ( ) { 
        return this.image;
    }
    
    /** SETTER
     * Image URL representing the product.
     */
    @JsonSetter("image")
    public void setImage (String value) { 
        this.image = value;
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
 