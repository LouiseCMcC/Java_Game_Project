package characters;

import magics.Curse;
import mythical_creatures.MythicalCreature;

import java.util.ArrayList;
import java.util.Collection;

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

    public void addCurse(Curse curse) {
        this.curses.add(curse);
    }

    public ArrayList getCurses() {
        return this.curses;
    }

    public int getBaseDamage(Curse curse) {
        for(Curse knownCurse : this.curses){
            if(curse == knownCurse){
                return curse.getDamage();
            }
        }
        return 0;
    }
}
