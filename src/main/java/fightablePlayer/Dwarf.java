package fightablePlayer;

import Enums.Weapon;
import abstractClasses.Player;
import behaviours.IFightable;
import com.sun.source.tree.IfTree;

public class Dwarf extends Player implements IFightable{

    private String name;
    private int health;
    private Weapon weapon;

    public Dwarf(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
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

    public void sleep(){
        addToHealth(5);
    }

    public void digHole(){
        sleep();
    }
}
