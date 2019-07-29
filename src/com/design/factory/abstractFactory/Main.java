package com.design.factory.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory af = new ModernFactory();
        Weapon ak47 = af.createWeapon();
        ak47.fire();
        Food bream = af.createFood();
        bream.printName();
        Vehicle car = af.createVehicle();
        car.go();

        AbstractFactory af2 = new MagicFactory();
        af2.createVehicle().go();
        af2.createFood().printName();
        af2.createWeapon().fire();
    }
}
