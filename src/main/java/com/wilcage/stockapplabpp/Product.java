package com.wilcage.stockapplabpp;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "products")
public class Product implements Serializable{
    @Id
    private String description;
    @GeneratedValue(strategy = GenerationType.AUTO)
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
