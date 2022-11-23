package characters;

import weapons.Club;
import weapons.Fork;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.Collection;

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
        for (Fork ownFork : this.forks){
            if(fork == ownFork){
                this.weapon = fork;
            }
        }
    }

    public void addWeapon(Fork fork) {
        this.forks.add(fork);
    }

    public ArrayList getWeapons() {
        return this.forks;
    }

    public int getBaseDamage() {
        if (this.weapon != null) {
            return this.weapon.getDamage();
        }
        return 1;
    }
}
