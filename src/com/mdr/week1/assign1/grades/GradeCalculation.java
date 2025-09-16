package com.mdr.week1.assign1.grades;

import java.util.Scanner;
import java.util.InputMismatchException;
public class GradeCalculation {

	public void GradeCalc(Scanner sc) {
		
	/*
	 * Logic for grade calculation...	
	 */
		
		int marks[] = new int[6];
		float total = 0, avg;

		
		for (int i = 0; i < 6; i++) {
            while (true) {
                try {
                    System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
                    marks[i] = sc.nextInt(); // ✅ use sc, not scanner
                    if (marks[i] < 0 || marks[i] > 100) {
                        System.out.println("Marks should be between 0 and 100. Try again.");
                        continue;
                    }
                    total += marks[i];
                    break; // exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.nextLine(); // clear invalid input
                }
            }
        }

		// Calculating average here
		avg = total / 6;
		
		/*
		 * modify this as per your outline... 
		 */

		System.out.print("The student Grade is: ");
		if (avg >= 90) {
			System.out.print("A");
		} 
		else if (avg >= 80 && avg < 90) {
			System.out.print("B");
		} 
		else if (avg >= 60 && avg < 80) {
			System.out.print("C");
		} 
		else if (avg >= 40 && avg < 60) {
			System.out.print("D");
		} 
		else {
			System.out.print("F");
		}


		
	}
	
}


