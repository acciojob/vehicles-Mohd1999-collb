package com.driver;
/*Car: extends Vehicle

    1. constructor: initialize the variables using parameters and set currentGear as 1.
    2. changeGear(newGear): set the current gear to newGear parameter.
    3. changeSpeed(newSpeed, newDirection): set the speed and direction using move().
 */


public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setManual(boolean isManual) {
        this.isManual = isManual;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    
    public int getCurrentGear() {
        return currentGear;
    }
}
