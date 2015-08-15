package com.wilcage.stockapplabpp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/14/15
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class InventoryController {

    protected final StockLogger logger = StockLogger.getLogger(this.getClass());

    @Autowired
    private ProductManager productManager;

    @RequestMapping("/hello.html")
    public ModelAndView handleRequest(HttpServletRequest request , HttpServletResponse response){
        String now = new Date().toString();

        logger.info("Running hello world : "+now);

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("nowDate", now);
        model.put("products", productManager.getProducts());

        ModelAndView modelAndView = new ModelAndView("hello", "model",model);
        return modelAndView;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }
}
