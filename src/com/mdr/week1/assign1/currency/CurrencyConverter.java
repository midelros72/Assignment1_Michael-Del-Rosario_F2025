package com.mdr.week1.assign1.currency;

import java.util.Scanner;

public class CurrencyConverter {

    // Example CAD to USD rate (update manually if needed)
    private static final double CAD_TO_USD_RATE = 0.73;

    public void CadToUsd(Scanner sc) {
         
        
            System.out.print("Enter CAD amount: ");
            double cad = sc.nextDouble();
            System.out.println(cad + " CAD = " + (cad * CAD_TO_USD_RATE) + " USD");
        
    }
}
