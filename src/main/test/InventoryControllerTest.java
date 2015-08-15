import com.wilcage.stockapplabpp.InventoryController;
import com.wilcage.stockapplabpp.SimpleProductManager;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/14/15
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class InventoryControllerTest {

    @Test
    public void testHandleRequestView(){

        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());

        ModelAndView modelAndView = controller.handleRequest(null, null);
        Map<String, Object> model = (Map<String, Object>) modelAndView.getModel().get("model");

        Assert.assertEquals("hello", modelAndView.getViewName());
        Assert.assertNotNull("model is null",model.get("nowDate"));

    }
}
