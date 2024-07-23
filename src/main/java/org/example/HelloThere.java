package org.example;

import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // First question
        System.out.println("Hello there! How are you doing today?");

        // Read the first input
        String response1 = scanner.nextLine();

        // Second question
        System.out.println("Wow - Interesting! Tell me more!");

        // Read the second input
        String response2 = scanner.nextLine();

        // Print a goodbye message
        System.out.println("Nice chatting with you! Goodbye");

        // Close the scanner
        scanner.close();
    }
}
