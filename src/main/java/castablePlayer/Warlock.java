package castablePlayer;

import Enums.Creature;
import Enums.Spell;
import abstractClasses.Player;

public class Warlock extends Player {

    String name;
    int health;
    Creature creature;
    Spell spell;

    public Warlock(String name, Creature creature, Spell spell){
        super(name);
        this.creature = creature;
        this.spell = spell;
    }






}
