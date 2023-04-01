package com.company;
 interface Car{
    String getName();
    int getMaxSpeed();
    default void applyBreak(){
        System.out.println("Applying break on " + getName());

    }
    static  Car getFastestCar(Car car1, Car car2){
        if(car1.getMaxSpeed()>=car2.getMaxSpeed()){
            return car1;
        }
        else{
            return car2;
        }
    }

}
public class MainApp {
}
