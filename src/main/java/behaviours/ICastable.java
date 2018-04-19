package behaviours;

import Enums.Spell;
import abstractClasses.Player;

public interface ICastable {

    public Spell getSpell();

    public void changeSpell(Spell spell);

    public void castSpell(Player player);
}
