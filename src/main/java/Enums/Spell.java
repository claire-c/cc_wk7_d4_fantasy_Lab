package Enums;

public enum Spell {

    LIGHTENING(55),
    FIREBALL(40),
    FLATULENCE(10),
    WEDGIE(5);

    private final int damageValue;

    Spell(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getdamageValue() { //UPDATED
        return damageValue; //UPDATED
    }
}
