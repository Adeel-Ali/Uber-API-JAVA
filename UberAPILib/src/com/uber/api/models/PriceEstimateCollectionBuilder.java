/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/17/2016
 */
package com.uber.api.models;

import java.util.*;

public class PriceEstimateCollectionBuilder {
    //the instance to build
    private PriceEstimateCollection priceEstimateCollection;

    /**
     * Default constructor to initialize the instance
     */
    public PriceEstimateCollectionBuilder() {
        priceEstimateCollection = new PriceEstimateCollection();
    }

    /**
     * List of price estimates
     */
    public PriceEstimateCollectionBuilder prices(List<PriceEsitmate> prices) {
        priceEstimateCollection.setPrices(prices);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PriceEstimateCollection build() {
        return priceEstimateCollection;
    }
}