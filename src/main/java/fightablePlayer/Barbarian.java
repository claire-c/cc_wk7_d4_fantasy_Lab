package fightablePlayer;

import Enums.Weapon;
import abstractClasses.Player;
import behaviours.IFightable;

public class Barbarian extends Player implements IFightable{

    private String name;
    private int health;
    private Weapon weapon;

    public Barbarian(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

//    public void defend(Player attacker){
//        attacker.get
//    }

    public void attack(Player player){
        player.takeDamage(weapon.getdamageValue());
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void berserkerRage(Player player){
        this.setHealth(0);
        player.setHealth(0);
    }


}
