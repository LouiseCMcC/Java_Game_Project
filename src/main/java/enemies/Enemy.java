package enemies;

import behaviours.IDamageType;

import java.util.ArrayList;

public abstract class Enemy {
    private int healthPoints;
    private IDamageType weakness;

    public Enemy(int healthPoints, IDamageType weakness){
        this.healthPoints=healthPoints;
        this.weakness=weakness;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public IDamageType getWeakness() {
        return weakness;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }



}
