/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/17/2016
 */
package com.uber.api.models;

import java.util.*;

public class RequestBuilder 
        extends ErrorBaseBuilder {
    //the instance to build
    private Request request;

    /**
     * Default constructor to initialize the instance
     */
    public RequestBuilder() {
        request = new Request();
    }

    /**
     * The object that contains driver details.
     */
    public RequestBuilder driver(LinkedHashMap<String, Object> driver) {
        request.setDriver(driver);
        return this;
    }

    /**
     * The estimated time of vehicle arrival in minutes.
     */
    public RequestBuilder eta(int eta) {
        request.setEta(eta);
        return this;
    }

    /**
     * The object that contains the location information of the vehicle and driver
     */
    public RequestBuilder location(LinkedHashMap<String, Object> location) {
        request.setLocation(location);
        return this;
    }

    /**
     * The unique ID of the Request.
     */
    public RequestBuilder requestId(String requestId) {
        request.setRequestId(requestId);
        return this;
    }

    /**
     * The status of the Request indicating state.
     */
    public RequestBuilder status(String status) {
        request.setStatus(status);
        return this;
    }

    /**
     * The surge pricing multiplier used to calculate the increased price of a Request. A multiplier of 1.0 means surge pricing is not in effect.
     */
    public RequestBuilder surgeMultiplier(double surgeMultiplier) {
        request.setSurgeMultiplier(surgeMultiplier);
        return this;
    }

    /**
     * The object that contains vehicle details.
     */
    public RequestBuilder vehicle(LinkedHashMap<String, Object> vehicle) {
        request.setVehicle(vehicle);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Request build() {
        return request;
    }
}