/*
 * Author: Thomas Hoerger
 * Date: September 7, 2025
 * Assignment: Homework 1 - Question 3
 *
 * This file contains the 'main' class for Question 3.
 * It creates a personlist object, loads data from persons.txt,
 * displays the list, and demonstrates searching by ID.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        personlist pl = new personlist();

        // Load data from persons.txt
        pl.store(new FileInputStream("persons.txt"));

        // Display all people
        pl.display(System.out);

        // Test the find method
        System.out.println("Index of 123: " + pl.find("123"));
        System.out.println("Index of 999: " + pl.find("999"));
    }
}
