package com.mdr.week1.assign1.conversion;

import java.util.Scanner;

public class LitersToGallons {

    private static final double CONVERSION_FACTOR = 0.264172;

    public void LitersToGallon(Scanner sc) {
         
        
            System.out.print("Enter liters: ");
            double liters = sc.nextDouble();
            System.out.println(liters + " liters = " + (liters * CONVERSION_FACTOR) + " gallons");
        
    }
}
