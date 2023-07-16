package com.shivanshu.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Builder carBuilder = new CarBuilder();
        Builder carManualBuilder = new CarManualBuilder();

        Director director = new Director();
        director.constructSUV(carBuilder);
        director.constructSUV(carManualBuilder);

        Car car = (Car) carBuilder.getResult();
        Manual manual = (Manual) carManualBuilder.getResult();

        System.out.println("Car: "+car);
        System.out.println("Manual: "+manual);
    }
}
