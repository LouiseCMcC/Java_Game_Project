package characterTests;

import characters.Warlock;
import magics.Curse;
import magics.MagicType;
import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Curse curse;
    MythicalCreature mythicalCreature;


    @Before
    public void before(){
        mythicalCreature=new MythicalCreature("Cerebrus", 5, 20);
        warlock=new Warlock("Gargamel", 100, 200, mythicalCreature);
        curse=new Curse(10, MagicType.FIRE, "hell flame");
    }

    @Test
    public void canAddCurse(){
        warlock.addCurse(curse);
        assertEquals(1, warlock.getCurses().size());

    }

    @Test
    public void canGetBaseDamageWithNoSpell(){
        assertEquals(0, warlock.getBaseDamage(curse));
    }

    @Test
    public void canGetBaseDamageWithWeapon(){
        warlock.addCurse(curse);
        assertEquals(10, warlock.getBaseDamage(curse));
    }



}
