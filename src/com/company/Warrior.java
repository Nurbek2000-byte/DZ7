package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String typeSuperpower) {
        super(health, damage, typeSuperpower);
    }

    public Warrior(String typeSuperpower) {
        super(typeSuperpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior" + "применил суперспособность" + "CRITICAL DAMAGE");
    }
}
