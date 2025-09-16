package com.mdr.week1.assign1.conversion;

import java.util.Scanner;

public class MilesToKilometers {

    private static final double CONVERSION_FACTOR = 1.60934;

    public void MilesToKm(Scanner sc) {
        
        
        	System.out.print("Enter miles: ");
            double miles = sc.nextDouble();
            System.out.println(miles + " miles = " + (miles * CONVERSION_FACTOR) + " kilometers");
       
    }
}
