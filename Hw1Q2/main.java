/*
 * Author: Thomas Hoerger
 * Date: September 7, 2025
 * Assignment: Homework 1 - Question 2
 *
 * This file contains the 'main' class.
 * It uses a LinkedList of 'person' objects and provides methods to:
 *   - store people from an input stream
 *   - display people to an output stream
 *   - find a person by ID
 * The main method demonstrates these features.
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

    // Reads people data from an input stream and stores them in a LinkedList
    public static void store(InputStream in, LinkedList<person> list) {
        try (Scanner sc = new Scanner(in)) {
            while (sc.hasNext()) {
                String first = sc.next();
                String last  = sc.next();
                String id    = sc.next();
                list.add(new person(first, last, id));
            }
        }
    }

    // Displays all person objects in the LinkedList to the output stream
    public static void display(PrintStream out, LinkedList<person> list) {
        for (person p : list) out.println(p);
    }

    // Finds the index of a person with the given ID in the LinkedList
    public static int find(String sid, LinkedList<person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) return i;
        }
        return -1; // return -1 if ID not found
    }

    // Main program entry point
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<person> people = new LinkedList<>();

        // Load data from persons.txt
        try (FileInputStream fis = new FileInputStream("persons.txt")) {
            store(fis, people);
        }

        // Display all people
        display(System.out, people);

        // Test the find method
        System.out.println("Index of ID=123: " + find("123", people));
        System.out.println("Index of ID=999: " + find("999", people)); // should return -1
    }
}
