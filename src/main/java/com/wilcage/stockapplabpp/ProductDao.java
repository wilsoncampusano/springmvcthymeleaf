package com.wilcage.stockapplabpp;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductDao {

    public List<Product> getProductList();
    public void saveProduct(Product product);
}
