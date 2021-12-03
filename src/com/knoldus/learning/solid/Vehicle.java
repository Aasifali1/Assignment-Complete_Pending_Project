package com.knoldus.learning.solid;

public class Vehicle {
    public void startEngine() throws Exception {
        System.out.println("start Engine");
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
        System.out.println("Car Engine is started");
    }
}
class Truck extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        System.out.println("Truck Engine is started");
    }
}

class BiCycle extends NonEngineVehicle{
    @Override
    public void startEngine() throws Exception{
        throw new Exception("Start Engine not supported");
    }
}
