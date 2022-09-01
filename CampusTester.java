package com.mycompany.campusapp;

/**
 * “I hereby declare upon my word of honor that I have neither given nor received unauthorized help on this work.”
 * CPSC 240 Section 03
 * @version 1.0
 * @author Chris Whitworth
 */
public class CampusTester {

     
     /** main
     * @param args
     */
    public static void main(String[] args) {

        // This sets the static CampusState
        Campus.setCampusState("Virginia");

        // 2.A First Campus object named VSU should be created using the parametrized constructor. Use getters to print this Campus object created.
        Campus VSU = new Campus("VSU");
        System.out.println(VSU.getCampusName());

        // 2.B Second Campus object named UMW should be created using the parametrized constructor. Use the toString() method to print this object created.
        Campus UMW = new Campus("UMW");
        System.out.println(UMW.toString());

        // 2.C Print the residing state of both universities using the static method getState(). Remember, this has to be called/invoked using the class Campus.
        System.out.println(VSU.getCampusState());
        System.out.println(UMW.getCampusState());

        /* 2.D Add two places to UMW campus object (Ball Circle and James Farmer Hall) using 
        *  addPlaces() method. Finally, print the places you just added from the arrayList returned. */
        UMW.addPlaces("Ball Circle");
        UMW.addPlaces("James Farmers Hall");
        System.out.println(UMW.getCampusPlace());

    }
}
