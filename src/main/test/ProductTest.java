import com.wilcage.stockapplabpp.Product;
import junit.framework.TestCase;
import org.junit.*;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProductTest {
    private Product product;

    @Before
    public void withANewProduct(){
        product = new Product();
    }

    @Test
    public void testSetAndGetDescription(){
        String description = "a description";
        assertNull(product.getDescription());
        product.setDescription(description);
        Assert.assertEquals(description, product.getDescription());
    }

    @Test
    public void testSetAndGetPrice(){
        int price = 10;
        assertEquals(0, product.getPrice(),0);
        product.setPrice(price);
        TestCase.assertEquals(price, product.getPrice(),0);
    }
}
