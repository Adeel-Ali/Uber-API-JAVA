/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;

public class ProductCollectionBuilder {
    //the instance to build
    private ProductCollection productCollection;

    /**
     * Default constructor to initialize the instance
     */
    public ProductCollectionBuilder() {
        productCollection = new ProductCollection();
    }

    /**
     * List of products
     */
    public ProductCollectionBuilder products(List<Product> products) {
        productCollection.setProducts(products);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProductCollection build() {
        return productCollection;
    }
}