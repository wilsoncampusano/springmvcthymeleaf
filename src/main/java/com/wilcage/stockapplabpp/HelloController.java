package com.wilcage.stockapplabpp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/14/15
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class HelloController {

    protected final StockLogger logger = StockLogger.getLogger(this.getClass());

    @RequestMapping("/")
    public ModelAndView handleRequest(HttpServletRequest request , HttpServletResponse response){
        logger.info("Running hello world");

        return new ModelAndView("hello.jsp");
    }
}
