/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/17/2016
 */
package com.uber.api.models;

import java.util.*;

public class UserProfileBuilder {
    //the instance to build
    private UserProfile userProfile;

    /**
     * Default constructor to initialize the instance
     */
    public UserProfileBuilder() {
        userProfile = new UserProfile();
    }

    /**
     * Email address of the Uber user
     */
    public UserProfileBuilder email(String email) {
        userProfile.setEmail(email);
        return this;
    }

    /**
     * First name of the Uber user.
     */
    public UserProfileBuilder firstName(String firstName) {
        userProfile.setFirstName(firstName);
        return this;
    }

    /**
     * Last name of the Uber user.
     */
    public UserProfileBuilder lastName(String lastName) {
        userProfile.setLastName(lastName);
        return this;
    }

    /**
     * Image URL of the Uber user.
     */
    public UserProfileBuilder picture(String picture) {
        userProfile.setPicture(picture);
        return this;
    }

    /**
     * Promo code of the Uber user.
     */
    public UserProfileBuilder promoCode(String promoCode) {
        userProfile.setPromoCode(promoCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserProfile build() {
        return userProfile;
    }
}