package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * Option 1: try-catch and handle any thrown exception
     * Option 2: Punt
     */
//    public void goToWork() {
//        Car c = new Car("JRE345", "Toyota", "Tacoma");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            c.stop();
//        }
    /*
     * Option 2: Punt, don't handle any thrown exception at all
     * because the exception is question is CHECKED, I MUST say "throws"
     */
//    public void goToWork() throws DestinationUnreachableException{
//
//        Car c = new Car("JRE345", "Toyota", "Tacoma");
//            c.start();
//
//            try {
//                c.moveTo("West Seattle");
//            }
//            finally {
//                c.stop();
//            }
//        }
        /*
         * Option 3
         * try-catch, "respond" in some way and then re-throw.
         */
//    public void goToWork() throws DestinationUnreachableException {
//
//        Car c = new Car("JRE345", "Toyota", "Tacoma");
//        c.start();
//
//        try {
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println("Email sent to Lisa Herbold to complain.");
//            throw e;
//        } finally {
//            c.stop();
//        }
//    }
    /*
     * Option 4:
     *
     */
    public void goToWork() throws WorkException {

        Car c = new Car("JRE345", "Toyota", "Tacoma");
        c.start();

        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
            finally {
            c.stop();
        }
    }



    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}