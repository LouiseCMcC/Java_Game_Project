package characters;

import magics.Spell;
import mythical_creatures.MythicalCreature;

import java.util.ArrayList;

public class Wizard extends Character{
    private ArrayList<Spell> spells;
    private MythicalCreature mythicalCreature;

    public Wizard(String name, int healthPoints, int treasure, MythicalCreature mythicalCreature){
        super(name, healthPoints, treasure);
        this.spells=new ArrayList<Spell>();
        this.mythicalCreature= mythicalCreature;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
