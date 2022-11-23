package rooms;

import characters.Dwarf;
import enemies.Enemy;
import enemies.Troll;
import characters.Character;

public class Room {

    private Enemy enemy;
    private int treasure;

    public Room(){};

    public void addEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void encounter(Character character) {
        while(character.getHealthPoints() > 0 || this.enemy.getHealthPoints() > 0){
            character.attack();
            this.enemy.attack();
        }
    }
}
