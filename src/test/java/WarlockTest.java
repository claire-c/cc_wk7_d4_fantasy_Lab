import Enums.Creature;
import Enums.Spell;
import castablePlayer.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock iceKing;

    @Before
    public void before(){
        iceKing = new Warlock("Ice King", Creature.GIANTEAGLE, Spell.LIGHTENING);
    }

    @Test
    public void canGetName(){
        assertEquals("Ice King",iceKing.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, iceKing.getHealth());
    }

    @Test
    public void canGetCreature(){
        assertEquals(Creature.GIANTEAGLE, iceKing.getCreature());
    }

    @Test
    public void canGetSpell(){
        assertEquals(Spell.LIGHTENING, iceKing.getSpell());
    }


    @Test

    public void canFly(){
        iceKing.fly();
        assertEquals(95, iceKing.getHealth());
    }

    @Test
    public void canChangeCreature(){
        iceKing.changeCreature(Creature.OGRE);
        assertEquals(Creature.OGRE, iceKing.getCreature());
    }

    @Test
    public void canChangeSpell(){
        iceKing.changeSpell(Spell.WEDGIE);
        assertEquals(Spell.WEDGIE, iceKing.getSpell());
    }
}
