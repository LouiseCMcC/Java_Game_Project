package weaponAndMagicTests;

import magics.Curse;
import magics.MagicType;
import magics.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {


    Spell spell;

    @Before
    public void before(){
        spell=new Spell(10, MagicType.LIGHTNING, "zeus thunder");
    }

    @Test
    public void spellHasType(){
        assertEquals(MagicType.LIGHTNING, spell.getMagicType());
    }

}
