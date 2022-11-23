package rooms;

import enemies.Enemy;
import enemies.Troll;

public class Room {

    private Enemy enemy;
    private int treasure;

    public Room(){};

    public void addEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
