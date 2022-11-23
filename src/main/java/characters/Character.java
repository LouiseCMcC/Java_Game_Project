package characters;

public abstract class Character {

    private String name;
    private int healthPoints;
    private int treasure;

    public Character(String name, int healthPoints, int treasure){
        this.name=name;
        this.healthPoints=healthPoints;
        this.treasure=treasure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public void attack(){

    }
}
