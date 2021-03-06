package com.knoldus.learning.solid;

public class Vehicle {
    public void startEngine() throws Exception {
        System.out.println("Engine started");
    }
    public static void main(String [] a) throws Exception {
        Vehicle v = new Car();
        v.startEngine();

        Vehicle t =new Truck();
        t.startEngine();

        Vehicle b = new BiCycle();
        b.startEngine();

    }
}

class Car extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        super.startEngine();
    }
}
class Truck extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        super.startEngine();
    }
}

//*****************************  Note ********************************************************
// we can apply Interface Segregation Principle here but i did't
// Because in this assignment the code is already given as throwing exception that's why i confused
// that i have to remove this code or just run this.

//  Note:  Hence if we want to apply ISP principle then i created two classes one for Engine vehicle
//  and the another one for non-engine vehicle.

// I have created another package named solidExample where i have applied five solid principles
// in this problem please check.

class BiCycle extends NonEngineVehicle{
    @Override
    public void startEngine() throws Exception{
        throw new Exception("Start Engine not supported");
    }
}
