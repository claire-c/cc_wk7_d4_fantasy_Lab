package fightablePlayer;

import Enums.Weapon;
import abstractClasses.Player;
import behaviours.IFightable;
import javafx.print.PageLayout;

public class Knight extends Player implements IFightable{

    private String name;
    private int health;
    private Weapon weapon;
    private int armour;

    public Knight(String name, Weapon weapon, int armour){
        super(name);
        this.weapon = weapon;
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void attack(Player player){
        player.takeDamage(weapon.getdamageValue());
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int getHealth(){
        int health = (100 + armour);
        setHealth(health);
        return health;
    }


}
