package com.wilcage.stockapplabpp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/priceincrease.html")
public class PriceIncreaseFormController {
    protected  StockLogger log = StockLogger.getLogger(this.getClass());

    @Autowired
    private ProductManager productManager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid PriceIncrease priceIncrease, BindingResult result) throws ServletException{
        log.info("increase controller ");
        if (result.hasErrors()){
            return "priceincrease";
        }

        int increase = priceIncrease.getPercentage();
        log.info("Increasing prices by "+ increase);

        productManager.increasePrice(increase);



        return "redirect:/hello.html";
    }


    @RequestMapping(method = RequestMethod.GET)
    public PriceIncrease formBackingObject(HttpServletRequest request){
        PriceIncrease priceIncrease = new PriceIncrease();
        priceIncrease.setPercentage(15);

        return priceIncrease;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }


}
