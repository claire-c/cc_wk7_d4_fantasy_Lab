import Enums.Creature;
import Enums.Spell;
import castablePlayer.Wizard;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.runtime.win32_x86.Win32X86JavaThreadPDAccess;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Rincewind", Creature.LUGGAGE, Spell.FLATULENCE);
    }

    @Test
    public void canGetName(){
        assertEquals("Rincewind",wizard.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canGetCreature(){
        assertEquals(Creature.LUGGAGE, wizard.getCreature());
    }

    @Test
    public void canGetSpell(){
        assertEquals(Spell.FLATULENCE, wizard.getSpell());
    }


    @Test
    public void canRideLuggage(){
        wizard.rideCreature();
        assertEquals(105, wizard.getHealth());
    }

    @Test
    public void canChangeCreature(){
        wizard.changeCreature(Creature.DRAGON);
        assertEquals(Creature.DRAGON, wizard.getCreature());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(Spell.WEDGIE);
        assertEquals(Spell.WEDGIE, wizard.getSpell());
    }

}
