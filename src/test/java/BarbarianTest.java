import Enums.Creature;
import Enums.Spell;
import Enums.Weapon;
import castablePlayer.Wizard;
import fightablePlayer.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Wizard wizard;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Weapon.SWORD);
        wizard = new Wizard("Rincewind", Creature.LUGGAGE, Spell.FLATULENCE);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }

//    @Test
//    public void canDefend(){
//        barbarian.defend(wizard);
//        assertEquals(95, barbarian.getHealth());
//    }

    @Test
    public void canAttack(){
        barbarian.attack(wizard);
        assertEquals(80, wizard.getHealth());
    }

    @Test
    public void canDoBerserkerRage(){
        barbarian.berserkerRage(wizard);
        assertEquals(0, wizard.getHealth());
        assertEquals(0, barbarian.getHealth());
    }



}
