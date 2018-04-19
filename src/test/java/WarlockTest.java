import Enums.Creature;
import Enums.Spell;
import castablePlayer.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Ice King", Creature.GIANTEAGLE, Spell.LIGHTENING);
    }

    @Test
    public void canGetName(){
        assertEquals("Ice King",warlock.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canGetCreature(){
        assertEquals(Creature.GIANTEAGLE, warlock.getCreature());
    }

    @Test
    public void canGetSpell(){
        assertEquals(Spell.LIGHTENING, warlock.getSpell());
    }


    @Test

    public void canFly(){
        warlock.fly();
        assertEquals(95, warlock.getHealth());
    }

    @Test
    public void canChangeCreature(){
        warlock.changeCreature(Creature.OGRE);
        assertEquals(Creature.OGRE, warlock.getCreature());
    }

    @Test
    public void canChangeSpell(){
        warlock.changeSpell(Spell.WEDGIE);
        assertEquals(Spell.WEDGIE, warlock.getSpell());
    }
}
