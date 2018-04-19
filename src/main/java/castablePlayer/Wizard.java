package castablePlayer;

import Enums.Creature;
import Enums.Spell;
import abstractClasses.Player;

public class Wizard extends Player {
    String name;
    int health;
    Creature creature;
    Spell spell;

    public Wizard(String name, Creature creature, Spell spell){
        super(name);
        this.creature = creature;
        this.spell = spell;
    }

    public Creature getCreature(){
        return creature;
    }

    public Spell getSpell(){
        return spell;
    }

    public void rideCreature(){
        addToHealth(5);
    }

    public void changeCreature(Creature creature){
        this.creature = creature;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;

    }

}
