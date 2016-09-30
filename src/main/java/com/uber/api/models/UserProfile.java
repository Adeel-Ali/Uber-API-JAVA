/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserProfile 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5157084942056527123L;
    private String email;
    private String firstName;
    private String lastName;
    private String picture;
    private String promoCode;
    /** GETTER
     * Email address of the Uber user
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email address of the Uber user
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * First name of the Uber user.
     */
    @JsonGetter("first_name")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * First name of the Uber user.
     */
    @JsonSetter("first_name")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * Last name of the Uber user.
     */
    @JsonGetter("last_name")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Last name of the Uber user.
     */
    @JsonSetter("last_name")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * Image URL of the Uber user.
     */
    @JsonGetter("picture")
    public String getPicture ( ) { 
        return this.picture;
    }
    
    /** SETTER
     * Image URL of the Uber user.
     */
    @JsonSetter("picture")
    public void setPicture (String value) { 
        this.picture = value;
    }
 
    /** GETTER
     * Promo code of the Uber user.
     */
    @JsonGetter("promo_code")
    public String getPromoCode ( ) { 
        return this.promoCode;
    }
    
    /** SETTER
     * Promo code of the Uber user.
     */
    @JsonSetter("promo_code")
    public void setPromoCode (String value) { 
        this.promoCode = value;
    }
 
}
 