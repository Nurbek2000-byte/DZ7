package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage, String typeSuperpower) {
        super(health, damage, typeSuperpower);
    }

    public Magic(String typeSuperpower) {
        super(typeSuperpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic" + "применил суперспособность" +"CRITICAL DAMAGE");
    }
}
