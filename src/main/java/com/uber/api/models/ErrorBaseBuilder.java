/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;

public class ErrorBaseBuilder {
    //the instance to build
    private ErrorBase errorBase;

    /**
     * Default constructor to initialize the instance
     */
    public ErrorBaseBuilder() {
        errorBase = new ErrorBase();
    }

    public ErrorBaseBuilder errors(List<Errors> errors) {
        errorBase.setErrors(errors);
        return this;
    }

    public ErrorBaseBuilder meta(String meta) {
        errorBase.setMeta(meta);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ErrorBase build() {
        return errorBase;
    }
}