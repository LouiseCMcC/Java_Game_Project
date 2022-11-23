package characters;

import magics.Curse;
import magics.Spell;
import mythical_creatures.MythicalCreature;

import java.util.ArrayList;
import java.util.Collection;

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

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public ArrayList getSpells() {
       return this.spells;
    }

    public int getBaseDamage(Spell spell) {
        for(Spell knownSpell : this.spells){
            if(spell == knownSpell){
                return spell.getDamage();
            }
        }
        return 0;
    }
}
