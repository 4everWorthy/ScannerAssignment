package org.example;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for a string of text
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();

        // Prompt for an integer
        System.out.println("Enter an integer: ");
        int number = Integer.valueOf(scanner.nextLine()); //'Integer.parseInt()' call can be used instead

        // Prompt for a double
        System.out.println("Enter a double: ");
        double doubleValue = Double.valueOf(scanner.nextLine()); //'Double.parseDouble()' call can be used instead

        // Prompt for a boolean value
        System.out.println("Enter a boolean value: ");
        boolean boolValue = Boolean.valueOf(scanner.nextLine()); //'Boolean.parseBoolean()' call can be used instead

        // Print the values
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + number);
        System.out.println("Your double is " + doubleValue);
        System.out.println("Your boolean is " + boolValue);

        // Close the scanner
        scanner.close();
    }
}
