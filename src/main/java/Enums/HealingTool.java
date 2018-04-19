package Enums;

public enum HealingTool {

    SUPERPOTION(50),
    BITTEROOT(25),
    DANDELION(5),
    THOUGHTSPRAYERS(-1),
    RESURRECTION(100);
    ;

    private final int value;

    HealingTool(int value) {
        this.value = value;
    }

    public int getValue() { //UPDATED
        return value; //UPDATED
    }


}

