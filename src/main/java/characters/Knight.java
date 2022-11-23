package characters;

import weapons.Fork;
import weapons.Sword;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.Collection;

public class Knight extends Character{
    private Sword weapon;
    private ArrayList<Sword>swords;

    public Knight(String name, int healthPoints, int treasure){
        super(name, healthPoints, treasure);
        this.swords=new ArrayList<Sword>();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void addWeapon(Sword sword) {
        this.swords.add(sword);
    }

    public ArrayList getWeapons() {
        return this.swords;
    }

    public void setWeapon(Sword sword) {
        for (Sword ownSword : this.swords){
            if(sword == ownSword){
                this.weapon = sword;
            }
        }
    }

    public int getBaseDamage() {
        if (this.weapon != null) {
            return this.weapon.getDamage();
        }
        return 1;
    }
}
