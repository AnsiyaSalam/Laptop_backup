package com.stackroute.oops;

import javax.lang.model.util.ElementScanner6;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        Car c=new Car(name,modelName,type);
            return c;
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        Bike b=new Bike(name,modelName,type);

        return b;
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be down casted to their respective concrete types
        */
        Car car=(Car) first;
        Bike bike=(Bike) second;
        int speed=0;
        if(car.getType().equalsIgnoreCase("sports") && bike.getType().equalsIgnoreCase("sports"))
        {
           if(car.maxSpeed(car.getType())>bike.maxSpeed(car.getType()))
            {
                speed=car.maxSpeed(car.getType());
            }
            else if(car.maxSpeed(car.getType())<bike.maxSpeed(car.getType()))
            {
                speed=bike.maxSpeed(car.getType());
            }
            else if(car.maxSpeed(car.getType())==bike.maxSpeed(car.getType()))
            {
                speed=0;
            }
        }
        
            else 
                return -1;


      return speed;
    }
}
