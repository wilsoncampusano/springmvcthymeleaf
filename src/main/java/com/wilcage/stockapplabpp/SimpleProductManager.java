package com.wilcage.stockapplabpp;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
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

        //TODO:IMPLEMENTAR
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
