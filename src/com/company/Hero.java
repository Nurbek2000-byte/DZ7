package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    String typeSuperpower;

    public Hero(int health,int damage, String typeSuperpower){
        this.health = health;
        this.damage = damage;
        this.typeSuperpower = typeSuperpower;

    }
    public Hero(String typeSuperpower){
       this.typeSuperpower = typeSuperpower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeSuperpower() {
        return typeSuperpower;
    }

    public void setTypeSuperpower(String typeSuperpower) {
        this.typeSuperpower = typeSuperpower;
    }
}
