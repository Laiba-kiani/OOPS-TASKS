/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dishes;

/**
 *
 * @author abc
 */
import java.util.Scanner;
public class Dishes {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare attributes
        String dishtype;
        String ingredients;
        String cuisine;

        // Take user input
        System.out.print("Enter the type of dish (e.g., Sweet, Savory): ");
        dishtype = scanner.nextLine();

        System.out.print("Enter the ingredients (comma-separated): ");
        ingredients = scanner.nextLine();

        System.out.print("Enter the cuisine (e.g., Indian, Chinese, Italian): ");
        cuisine = scanner.nextLine();

        // Display the output
        System.out.println("\nWelcome to the Asian Restaurant!");
        System.out.println("Your selected choice of Dish is: " + dishtype);
        System.out.println("Your Dish contains the following ingredients: " + ingredients);
        System.out.println("Your Dish belongs to the " + cuisine + " cuisine.");
        scanner.close();
    }
}
