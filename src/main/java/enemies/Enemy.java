package enemies;

import behaviours.IDamageType;

import java.util.ArrayList;

public abstract class Enemy {
    private String name;
    private int healthPoints;
    private ArrayList<IDamageType>weakness;

    public Enemy(String name, int healthPoints, IDamageType weakness){
        this.name=name;
        this.healthPoints=healthPoints;
        this.weakness=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public ArrayList<IDamageType> getWeakness() {
        return weakness;
    }
}
