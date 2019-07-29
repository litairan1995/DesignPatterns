package com.design.factory.abstractFactory;

public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bream();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
