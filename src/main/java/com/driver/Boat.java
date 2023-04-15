package com.driver;


/*Boat: implements WaterVehicle interface

Has following member variables: a. name : of String type b. capacity : of int type
Return name and capacity in getVehicleName and getVehicleCapacity respectively. */

public class Boat implements  WaterVehicle {

    private String name;
    private int capacity;

    Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setCapacity(int capacity) {
    //     this.capacity = capacity;
    // }

    public String getVehicleName(){
        return name;
    }
    public int getVehicleCapacity(){
        return capacity;
    }
}