package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String typeSuperpower) {
        super(health, damage, typeSuperpower);
    }

    public Medic(String typeSuperpower) {
        super(typeSuperpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic" + "применил суперспособность" +"CRITICAL HILL");
    }
}
