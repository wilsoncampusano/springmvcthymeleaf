package com.wilcage.stockapplabpp;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SimpleProductManager implements ProductManager{
    private List<Product> products ;


    @Override
    public void increasePrice(int percentage) {
        if (products !=null){
            products.forEach(product -> {
                double newPrice = product.getPrice() * (100+percentage)/100;
                product.setPrice(newPrice);
            });
        }
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
