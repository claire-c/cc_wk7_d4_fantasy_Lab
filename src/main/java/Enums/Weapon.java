package Enums;

public enum Weapon {

    SWORD(20),
    AXE(25),
    BOW(40),
    CLUB(10);

    private final int damageValue;

    Weapon(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getdamageValue() { //UPDATED
        return damageValue;
    }
    }


