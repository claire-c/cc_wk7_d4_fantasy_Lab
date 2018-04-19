package behaviours;

import Enums.HealingTool;
import abstractClasses.Player;

public interface IHealable {

    public void healPlayer(Player player);

    public void changeHealingTool(HealingTool healingTool);
}
