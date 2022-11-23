package characters;

import weapons.Fork;
import weapons.Weapon;

import java.util.ArrayList;

public class Dwarf extends Character{
    private Fork weapon;
    private ArrayList<Fork> forks;

    public Dwarf(String name, int healthPoints, int treasure){
        super(name, healthPoints, treasure);
        this.forks=new ArrayList<Fork>();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Fork fork) {
        this.weapon = fork;
    }
}
