package castablePlayer;

import Enums.Creature;
import Enums.Spell;
import abstractClasses.Player;
import behaviours.ICastable;

public class Warlock extends Player implements ICastable {

    String name;
    int health;
    Creature creature;
    Spell spell;

    public Warlock(String name, Creature creature, Spell spell){
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

    public void fly(){
        takeDamage(5);
    }

    public void changeCreature(Creature creature){
        this.creature = creature;
    }

    public void changeSpell(Spell spell){
        this.spell  = spell;
    }

    public void castSpell(Player player){
        player.takeDamage(spell.getdamageValue());
    }
}
