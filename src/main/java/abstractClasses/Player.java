package abstractClasses;

public class Player {

    private String name;
    private int health;

    public Player(String name){
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void addToHealth(int pointsToAdd){
        this.health += pointsToAdd;
    }

    public void takeDamage(int pointToRemove){
        this.health -= pointToRemove;
    }


}
