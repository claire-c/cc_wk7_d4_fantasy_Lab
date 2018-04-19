package healablePlayer;

import Enums.HealingTool;
import abstractClasses.Player;
import behaviours.IHealable;

public class Cleric extends Player implements IHealable {

    private String name;
    private int health;
    private HealingTool healingTool;

    public Cleric(String name, HealingTool healingTool){
        super(name);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void haveANiceCupOfTea(){
        addToHealth(5);
    }

    public void changeHealingTool(HealingTool healingTool){
        this.healingTool = healingTool;
    }

    public void healPlayer(Player player){
        player.addToHealth(healingTool.getValue());
    }



}
