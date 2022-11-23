package characters;

import magics.Curse;
import mythical_creatures.MythicalCreature;

import java.util.ArrayList;

public class Warlock extends Character{
    private ArrayList<Curse> curses;
    private MythicalCreature mythicalCreature;

    public Warlock(String name, int healthPoints, int treasure, MythicalCreature mythicalCreature){
        super(name, healthPoints, treasure);
        this.curses=new ArrayList<Curse>();
        this.mythicalCreature= mythicalCreature;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
