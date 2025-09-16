package com.mdr.week1.assign1;

import java.util.Scanner;

import com.mdr.week1.assign1.grades.GradeCalculation;
import com.mdr.week1.assign1.conversion.MilesToKilometers;
import com.mdr.week1.assign1.conversion.LitersToGallons;
import com.mdr.week1.assign1.currency.CurrencyConverter;

public class DriverMain {
    public static void main(String[] args) {
        GradeCalculation gc = new GradeCalculation();
        MilesToKilometers mk = new MilesToKilometers();
        LitersToGallons lg = new LitersToGallons();
        CurrencyConverter cc = new CurrencyConverter();

        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("\nEnter the choice for operation:");
            System.out.println("1 - Grade Calculation");
            System.out.println("2 - Miles to Kilometers");
            System.out.println("3 - Liters to Gallons");
            System.out.println("4 - CAD to USD");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Doing Grade Calculation...");
                    gc.GradeCalc(sc);
                    break;
                case 2:
                    System.out.println("Doing Miles to Kilometers...");
                    mk.MilesToKm(sc);
                    break;
                case 3:
                    System.out.println("Doing Liters to Gallons...");
                    lg.LitersToGallon(sc);
                    break;
                case 4:
                    System.out.println("Doing CAD to USD Conversion...");
                    cc.CadToUsd(sc);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Loop until user enters a valid response
            while (true) {
                System.out.print("\nDo you want to perform another operation? (Y/N): ");
                String input = sc.next();
                if (input.length() == 1) {
                    again = input.charAt(0);
                    if (again == 'Y' || again == 'y' || again == 'N' || again == 'n') {
                        break; // valid input, exit the loop
                    }
                }
                System.out.println("Invalid option! Please enter Y or N.");
            }

        } while (again == 'Y' || again == 'y');

        System.out.println("Program terminated. Goodbye!");
        sc.close();
    }
}
