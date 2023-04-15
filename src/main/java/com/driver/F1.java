package com.driver;

/*F1: extends Car
    accelerate(rate): add rate to the current speed and change the gear accordingly

 */

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 2, 4, 5, isManual, "Autometic", 5);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        Vehicle vh = new Vehicle("Talib");
        Car ca = new Car("Sidd", 2, 4, 5, true, "Autometic", 5);

        newSpeed = vh.currentSpeed + rate;

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            vh.stop();
            ca.changeGear(1); 
        }
        //for all other cases, change the gear accordingly
        if(newSpeed > 0) {
            // changeSpeed(newSpeed, getCurrentDirection());
            changeSpeed(newSpeed, 30);
            if (newSpeed >= 1 && newSpeed <= 50) {
                ca.changeGear(1);                
            }else if(newSpeed >= 51 && newSpeed <= 100){
                ca.changeGear(2); 
            }else if(newSpeed >= 101 && newSpeed <= 150){
                ca.changeGear(3); 
            }else if(newSpeed >= 151 && newSpeed <= 200){
                ca.changeGear(4); 
            }else if(newSpeed >= 201 && newSpeed <= 250){
                ca.changeGear(5); 
            }else{
                ca.changeGear(6);
            }
        }
    }

    // public int getCurrentDirection(){
    //     Vehicle vh = new Vehicle("Talib");
    //     return vh.currentDirection;
    // }
}
