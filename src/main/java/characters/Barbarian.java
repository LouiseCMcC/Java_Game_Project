package characters;

import weapons.Club;
import weapons.Fork;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.Collection;

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
        for (Club ownClub : this.clubs){
            if(club == ownClub){
                this.weapon = club;
            }
        }
    }

    public void addWeapon(Club club) {
        this.clubs.add(club);
    }

    public ArrayList getWeapons() {
        return this.clubs;
    }

    public int getBaseDamage() {
        if (this.weapon != null) {
            return this.weapon.getDamage();
        }
        return 1;
    }
}
