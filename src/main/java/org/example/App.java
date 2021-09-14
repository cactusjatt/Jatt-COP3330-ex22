/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int x2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int x3 = in.nextInt();

        if(x1 == x2 || x2 == x3 || x3 == x1) {
            System.out.println("All the numbers aren't different");
            return;
        }

        int largest = 0;
        if(x1 > x2) {
            largest = x1;
        }
        else if(x2 > x3) {
            largest = x2;
        }
        else if(x3 > x2) {
            largest = x3;
        }

        System.out.println("The largest number is " + largest + ".");

        in.close();
    }
}