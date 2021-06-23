package com.company;

public class Main {

    public static void main(String[] args) {
        for (Hero hero : heroes()) {
            System.out.println(" Здоровье " + hero.getHealth() + " " + " Урон " + hero.getDamage() + " " + " Применил суперспособность" + hero.getTypeSuperpower());
        }

            }

    private static Hero[] heroes() {
        Hero magic = new Hero(100, 10, " FIRE BALL") {
            @Override
            public void applySuperAbility() {

            }
        };
        Hero medic = new Hero(80, 5, " SUPER HILL") {
            @Override
            public void applySuperAbility() {

            }
        };
        Hero warrior = new Hero(150, 15, " COMBO ATTACK") {
            @Override
            public void applySuperAbility() {

            }
        };
        return new Hero[]{magic,medic,warrior};
    }

}











