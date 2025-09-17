/*
 * Author: Thomas Hoerger
 * Date: September 7, 2025
 * Assignment: Homework 1 - Question 3
 *
 * This file defines the 'personlist' class.
 * It encapsulates a LinkedList of 'person' objects and provides:
 *   - storeOne() to add a single person
 *   - store() to bulk load people from an input stream
 *   - display() to print all people
 *   - find() to search for a person by ID
 */

import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class personlist {
    private LinkedList<person> list = new LinkedList<>();

    // Add a single person object to the list
    public void storeOne(person p) { list.add(p); }

    // Load multiple people from an input stream
    public void store(InputStream in) {
        try (Scanner sc = new Scanner(in)) {
            while (sc.hasNext()) {
                String first = sc.next();
                String last  = sc.next();
                String id    = sc.next();
                list.add(new person(first, last, id));
            }
        }
    }

    // Print all person objects to the output stream
    public void display(PrintStream out) {
        for (person p : list) out.println(p);
    }

    // Search for a person by ID and return index, or -1 if not found
    public int find(String sid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) return i;
        }
        return -1;
    }
}
