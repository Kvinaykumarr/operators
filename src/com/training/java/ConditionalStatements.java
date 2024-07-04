package com.training.java;

import java.util.SortedMap;

public class ConditionalStatements {
    public static void main(String[] args) {


          int productPrice;
             productPrice=200000;
             int discount;
             int discountPercentage;
             char membership;
             membership='s';
             if ( membership=='g'){
                 discountPercentage=20;
             }else if (membership=='s'){
                 discountPercentage=10;
             }else
                 discountPercentage=5;

       discount=productPrice*discountPercentage/100;
        System.out.println("discount percentage"+discount);

        System.out.println("finalprize=" + (productPrice-discount));

    }

}



