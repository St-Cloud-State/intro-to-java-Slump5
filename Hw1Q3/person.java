/*
 * Author: Thomas Hoerger
 * Date: September 7, 2025
 * Assignment: Homework 1 - Question 2
 *
 * This file defines the 'person' class.
 * It stores first name, last name, and a unique ID for each person.
 */

public class person {
    // Fields for storing person information
    private String firstname;
    private String lastname;
    private String id; // unique identifier

    // Constructor to initialize all fields
    public person(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    // Accessor (getter) methods
    public String getFirstname() { return firstname; }
    public String getLastname()  { return lastname; }
    public String getId()        { return id; }

    // Returns a string representation of the person
    @Override
    public String toString() {
        return firstname + " " + lastname + " (" + id + ")";
    }
}
