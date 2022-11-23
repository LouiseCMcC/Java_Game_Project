package characters;

import weapons.Club;
import weapons.Fork;
import weapons.Weapon;

import java.util.ArrayList;

public class Barbarian extends Character{
    private Club weapon;
    private ArrayList<Club> clubs;

    public Barbarian(String name, int healthPoints, int treasure){
        super(name, healthPoints, treasure);
        this.clubs=new ArrayList<Club>();
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Club club) {
        this.weapon = club;
    }
}
