package com.mycompany.campusapp;
import java.util.ArrayList;

/**
 * “I hereby declare upon my word of honor that I have neither given nor received unauthorized help on this work.”
 * CPSC 240 Section 03
 * @version 1.0
 * @author Chris Whitworth
 */
public class Campus {

    /**
     * Initiating fields
     */
    private String campusName = null;
    public ArrayList<String> campusPlace = new ArrayList<String>();
    private static String campusState = null;
    

    /**
     * parameterized constructor
     * @param campusName
     */
    public Campus(String campusName){
        this.campusName = campusName;
    }

    /**
     * Default constructor for Campus()
     */
    public Campus() {

    }

    /**
     * addPlaces() to ArrayList campusPlace, passing String place
     * @param place passed in to add to campusPlace ArrayList
     * @return campusPlace
     */
    public ArrayList<String> addPlaces(String place) {
        campusPlace.add(place);
        return campusPlace;
    }

    /**
     * Getter for campusPlace
     * @return campusPlace
     */
    public ArrayList<String> getCampusPlace() {
        return campusPlace;
    }

    /**
     * Getter for campusName
     * @return campusName
     */
    public String getCampusName() {
        return campusName;
    }

    /**
     * Getter for campusState
     * @return campusState
     */
    public String getCampusState() {
        return campusState;
    }

    /**
     * Setter for campusPlace
     * @param place sets the Campus Place of the object.
     */
    public void setCampusPlace(ArrayList<String> place) {
        campusPlace = place;
    }

    /**
     * Setter for campusName
     * @param name sets the Campus Name of the object.
     */
    public void setCampusName(String name){
        campusName = name;
    }

    /**
     * Setter for campusState
     * @param state
     */
    public static void setCampusState(String state) {
        campusState = state;
    }

    /**
     * toString() method to return the object created and its fields
     * @return a sentence that includes the name, place(s), and state of the object.
     */
    public String toString() {
        
        return "The Campus name is " + campusName + ".";

    }
}
