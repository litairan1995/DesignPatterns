package com.design.factory.abstractFactory;

public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicTicket();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
