import com.wilcage.stockapplabpp.Product;
import com.wilcage.stockapplabpp.ProductManager;
import com.wilcage.stockapplabpp.SimpleProductManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleProductManagerTest {

    private static final int PRODUCT_COUNT = 2;
    private static final int POSITIVE_INCREASE_PORCENTAGE = 10;
    ProductManager productManager ;

    static double chair_product_price = 20.50;
    static String chair_product_description = "chair";

    static double table_product_price = 150.10;
    static String table_product_description = "chair";

    @Before
    public void withANewProductManager(){

        productManager = new SimpleProductManager();
        List<Product> products = new ArrayList<Product>();


        Product chairProduct = new Product();
        chairProduct.setPrice(chair_product_price);
        chairProduct.setDescription(chair_product_description);
        products.add(chairProduct);

        Product tableProduct = new Product();
        tableProduct.setPrice(table_product_price);
        tableProduct.setDescription(table_product_description);
        products.add(tableProduct);

        productManager.setProducts(products);
    }
    @Test
    public void getProductsWithNoProducts(){
        productManager = new SimpleProductManager();
        Assert.assertNull(productManager.getProducts());
    }

    @Test
    public void testGetProducts(){
        List<Product> products = productManager.getProducts();

        Assert.assertNotNull(products);
        assertEquals(PRODUCT_COUNT, products.size());


        Product chair = products.get(0);
        Product table = products.get(1);

        assertEquals(chair_product_description, chair.getDescription());
        assertEquals(chair_product_price, chair.getPrice(), 0);

        assertEquals(table_product_description, table.getDescription());
        assertEquals(table_product_price, table.getPrice(),0);

    }

    @Test
    public void incresePriceWithNullListProducts(){
        try{
        productManager = new SimpleProductManager();
        productManager.increasePrice(POSITIVE_INCREASE_PORCENTAGE);
        }catch(Exception ex){
            fail("product list is null");
        }
    }

    @Test
    public void increasePriceWithEmptyProducts(){
       try{
           productManager = new SimpleProductManager();
           productManager.setProducts(new ArrayList<Product>());
           productManager.increasePrice(POSITIVE_INCREASE_PORCENTAGE);
       }catch(Exception ex){
           fail("product list is empty");

       }
    }



    @Test
    public void increasePriceWithPositivePorcentage(){
        productManager.increasePrice(POSITIVE_INCREASE_PORCENTAGE);
        double expecteChairPrice = 22.55;
        double expectedTablePrice = 165.11;

        List<Product> products = productManager.getProducts();
        Product chair = products.get(0);
        Product table = products.get(1);

        assertEquals(expecteChairPrice, chair.getPrice(),.0025);
        assertEquals(expectedTablePrice, table.getPrice(),.0025);

    }
}
