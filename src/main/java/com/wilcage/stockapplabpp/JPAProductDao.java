package com.wilcage.stockapplabpp;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("productDao")
public class JPAProductDao implements ProductDao {
    private EntityManager manager;

    @PersistenceContext
    public void setEntityManager(EntityManager manager){
        this.manager = manager;
    }

    @Transactional(readOnly = true)
    public List<Product> getProductList() {
        return manager.createQuery("select p from Product p order by p.id").getResultList();
    }

    @Transactional(readOnly = true)
    public void saveProduct(Product product) {
        manager.merge(product);
    }
}
