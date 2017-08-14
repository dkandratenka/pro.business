package com.pb.rest.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Created by DK on 14.08.2017.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Product {

    private String name;
    private int date;

    public Product(String name, int date) {
        this.name = name;
        this.date = date;
    }
}
