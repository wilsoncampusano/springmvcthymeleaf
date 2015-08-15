import com.wilcage.stockapplabpp.HelloController;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/14/15
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloControllerTest {

    @Test
    public void testHandleRequestView(){

        HelloController controller = new HelloController();

        ModelAndView modelAndView = controller.handleRequest(null, null);

        Assert.assertEquals("hello.jsp", modelAndView.getViewName());

    }
}
