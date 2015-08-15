package com.wilcage.stockapplabpp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wilson
 * Date: 8/14/15
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class StockLogger {

    private Log log;

    private StockLogger(Log log) {
             this.log = log;
    }

    public void info(Object object){
        log.info("**************** STOCK APP LOG *******************");
        log.info(object);
    }
    public void warning(Object object){
        log.warn("**************** STOCK APP LOG *******************");
        log.warn(object);
    }
    public void error(Object object){
        log.error("**************** STOCK APP LOG *******************");
        log.error(object);
    }
    public void general(Object object){
        log.trace("**************** STOCK APP LOG *******************");
        log.trace(object);
    }

    static StockLogger getLogger(Class clazz){


           return new StockLogger(LogFactory.getLog(clazz));
    }
}
