import Enums.Weapon;
import fightablePlayer.Dwarf;
import fightablePlayer.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Dwarf dwarf;

    @Before
    public void before(){
        knight = new Knight("Brienne", Weapon.SWORD, 20);
        dwarf = new Dwarf("Gimli", Weapon.AXE);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.SWORD, knight.getWeapon());
    }

    @Test
    public void canAttack(){
        knight.attack(dwarf);
        assertEquals(80, dwarf.getHealth());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(Weapon.BOW);
        assertEquals(Weapon.BOW, knight.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(120, knight.getHealth());
    }
}
