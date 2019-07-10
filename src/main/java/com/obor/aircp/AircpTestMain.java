package com.obor.aircp;


import com.obor.aircp.model.HOrder;
import com.obor.aircp.service.HOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class AircpTestMain {
    public static void main(String[] a){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("/applicationContext.xml");
        HOrderService hOrderService=(HOrderService) applicationContext.getBean("hOrderService");
        HOrder hOrder=new HOrder();
        hOrder.setEndDate(new Date());
        hOrder.setMoney("1244");
        hOrder.setEndDate(new Date());
        hOrder.setOrderStatus("notPaying");
        hOrder.setOrderCommodityId("1");
        int f=hOrderService.addOrderInfo(hOrder);
    }
}
