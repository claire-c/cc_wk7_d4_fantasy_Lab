import Enums.Weapon;
import fightablePlayer.Barbarian;
import fightablePlayer.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Barbarian barbarian;

    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", Weapon.AXE);
        barbarian = new Barbarian("Conan", Weapon.SWORD);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }

    @Test
    public void canAttack(){
        dwarf.attack(barbarian);
        assertEquals(75, barbarian.getHealth());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, dwarf.getWeapon());
    }

    @Test
    public void canSleep(){
        dwarf.sleep();
        assertEquals(105, dwarf.getHealth());
    }

    @Test
    public void canDigHole(){
        dwarf.digHole();
        assertEquals(105, dwarf.getHealth());
    }
}
