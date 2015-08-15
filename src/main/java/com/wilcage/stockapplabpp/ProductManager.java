package com.wilcage.stockapplabpp;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    public List<Product> getProducts();

    void setProducts(List<Product> products);
}
