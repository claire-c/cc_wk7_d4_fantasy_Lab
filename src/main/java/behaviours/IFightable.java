package behaviours;

import Enums.Weapon;
import abstractClasses.Player;

public interface IFightable {

    public void changeWeapon(Weapon weapon);

//    public void defend(Player attacker);

    public void attack(Player player);

}
