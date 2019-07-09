package com.obor.aircp;



public class AircpTestMain {
    enum OrderStatus
    {
        ongoing, notPaying, finish, backout
    }
    public static void main(String[] a){

        test(OrderStatus.backout);
    }
    public static void test(OrderStatus orderStatus){
        System.out.println(orderStatus);
    }
}
