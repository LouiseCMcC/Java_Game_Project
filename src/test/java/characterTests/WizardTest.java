package characterTests;

import characters.Warlock;
import characters.Wizard;
import magics.Curse;
import magics.MagicType;
import magics.Spell;
import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;
    MythicalCreature mythicalCreature;


    @Before
    public void before(){
        mythicalCreature=new MythicalCreature("Pegasus", 5, 20);
        wizard=new Wizard("Gandalf", 100, 200, mythicalCreature);
        spell=new Spell(10, MagicType.LIGHTNING, "zeus thunder");
    }

    @Test
    public void canAddCurse(){
        wizard.addSpell(spell);
        assertEquals(1, wizard.getSpells().size());

    }

    @Test
    public void canGetBaseDamageWithNoSpell(){
        assertEquals(0, wizard.getBaseDamage(spell));
    }

    @Test
    public void canGetBaseDamageWithWeapon(){
        wizard.addSpell(spell);
        assertEquals(10, wizard.getBaseDamage(spell));
    }
}
