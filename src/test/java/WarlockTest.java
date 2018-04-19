import Enums.Creature;
import Enums.Spell;
import castablePlayer.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock iceKing;
    private Creature gunter;
    private Spell spell;

    @Before
    public void before(){
        iceKing = new Warlock("Ice King", Creature.GIANTEAGLE, Spell.LIGHTENING);
    }

    @Test
    public void canGetName(){
        assertEquals("Ice King",iceKing.getName());
    }


}
