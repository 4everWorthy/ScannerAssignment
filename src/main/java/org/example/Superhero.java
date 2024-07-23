package org.example;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for the hero's name
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");

        // Read the hero's name
        String heroName = scanner.nextLine();

        // Prompt for the superpower
        System.out.println("What is their superpower?");

        // Read the superpower
        String superpower = scanner.nextLine();

        // Print the story
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability to " + superpower + " to save the world.");

        // Close the scanner
        scanner.close();
    }
}
