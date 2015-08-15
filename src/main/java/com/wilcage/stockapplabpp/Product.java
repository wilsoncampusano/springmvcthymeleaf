package com.wilcage.stockapplabpp;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class Product implements Serializable{
    private String description;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
