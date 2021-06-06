/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner pizza = new Scanner(System.in);
        System.out.print("How many people? ");
        int a = pizza.nextInt();
        System.out.print("How many pizzas do you have? ");
        int b = pizza.nextInt();
        System.out.print("How many slices per pizza? ");
        int c = pizza.nextInt();
        int d = b * c;
        System.out.println(a + " people with " + b + " pizzas (" + d + " slices)");
        int e = d / a;
        System.out.println("Each person gets " + e + " pieces of pizza.");
        int f = d % a;
        System.out.println("There are " + f + " leftover pieces.");


    }
}
