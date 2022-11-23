package characters;

import weapons.Sword;
import weapons.Weapon;

import java.util.ArrayList;

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

    public void setWeapon(Sword sword) {
        this.weapon = sword;
    }
}
