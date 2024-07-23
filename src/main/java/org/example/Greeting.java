package org.example;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("What's your name?");


        // Read the user's input
        String name = scanner.nextLine();

        // Print a greeting message
        System.out.println("Hi " + name);

        // Close the scanner
        scanner.close();
    }
}
