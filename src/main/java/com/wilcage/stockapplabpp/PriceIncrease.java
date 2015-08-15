package com.wilcage.stockapplabpp;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/15/15
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class PriceIncrease {
    protected final StockLogger log = StockLogger.getLogger(this.getClass());

    @Min(0)
    @Max(50)
    private int percentage;

    public StockLogger getLog() {
        return log;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        log.info("Percentage set to "+ percentage);
        this.percentage = percentage;
    }
}
