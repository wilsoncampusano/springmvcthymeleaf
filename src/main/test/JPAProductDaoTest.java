import com.wilcage.stockapplabpp.Product;
import com.wilcage.stockapplabpp.ProductDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class JPAProductDaoTest {
    private ApplicationContext context;
    private ProductDao productDao;

    @Before
    public void initializeContext(){
        context= new ClassPathXmlApplicationContext("classpath:test-context.xml");
        productDao = (ProductDao) context.getBean("productDao");
    }

    @Test
    public void testGetProductList(){
        List<Product> products = productDao.getProductList();
        Assert.assertEquals(3, products.size());
    }

    @Test
    public void testSaveProduct(){
        List<Product> products = productDao.getProductList();
        Product p = products.get(0);

        double price = p.getPrice();
        p.setPrice(200.1);

        productDao.saveProduct(p);

        List<Product> updatedProducts = productDao.getProductList();

        Product pupdate = updatedProducts.get(0);
        Assert.assertEquals(200.1,pupdate.getPrice(),.00025);

        pupdate.setPrice(price);
        productDao.saveProduct(pupdate);

    }
}
