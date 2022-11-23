package mythical_creatures;

public class MythicalCreature {
    private String name;
    private int damage;
    private int healthPoints;

    public MythicalCreature(String name, int damage, int healthPoints){
        this.name=name;
        this.damage=damage;
        this.healthPoints=healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
