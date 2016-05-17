/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/17/2016
 */
package com.uber.api.models;

import java.util.*;

public class UserActivityBuilder {
    //the instance to build
    private UserActivity userActivity;

    /**
     * Default constructor to initialize the instance
     */
    public UserActivityBuilder() {
        userActivity = new UserActivity();
    }

    /**
     * Total number of items available.
     */
    public UserActivityBuilder count(int count) {
        userActivity.setCount(count);
        return this;
    }

    /**
     * Information including the pickup location, dropoff location, request start time, request end time, and distance of requests (in miles), as well as the product type that was requested.
     */
    public UserActivityBuilder history(List<History> history) {
        userActivity.setHistory(history);
        return this;
    }

    /**
     * Number of items to retrieve (100 max).
     */
    public UserActivityBuilder limit(int limit) {
        userActivity.setLimit(limit);
        return this;
    }

    /**
     * Position in pagination.
     */
    public UserActivityBuilder offset(int offset) {
        userActivity.setOffset(offset);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserActivity build() {
        return userActivity;
    }
}