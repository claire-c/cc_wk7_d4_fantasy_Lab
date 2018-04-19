import Enums.Creature;
import Enums.HealingTool;
import Enums.Spell;
import Enums.Weapon;
import castablePlayer.Warlock;
import fightablePlayer.Barbarian;
import healablePlayer.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private Barbarian barbarian;
    private Warlock warlock;
    private Cleric cleric2;

    @Before
    public void setup(){
        cleric = new Cleric("Father Ted", HealingTool.THOUGHTSPRAYERS);
        cleric2 = new Cleric("Father Jack", HealingTool.BITTEROOT);
        barbarian = new Barbarian("Conan", Weapon.SWORD);
        warlock = new Warlock("Jimmy", Creature.GIANTEAGLE, Spell.FIREBALL);
    }

    @Test
    public void canGetHealingTool(){
        assertEquals(HealingTool.THOUGHTSPRAYERS, cleric.getHealingTool());
    }

    @Test
    public void canHaveANiceCupOfTea(){
        cleric2.haveANiceCupOfTea();
        assertEquals(105, cleric2.getHealth());
    }

    @Test
    public void canChangeHealingTool(){
        cleric.changeHealingTool(HealingTool.RESURRECTION);
        assertEquals(HealingTool.RESURRECTION, cleric.getHealingTool());
    }

    @Test
    public void canHealPlayer(){
        cleric.healPlayer(barbarian);
        assertEquals(99, barbarian.getHealth());
        cleric2.healPlayer(warlock);
        assertEquals(125, warlock.getHealth());
    }


}
