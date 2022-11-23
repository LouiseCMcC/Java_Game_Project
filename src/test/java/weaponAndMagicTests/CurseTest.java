package weaponAndMagicTests;

import magics.Curse;
import magics.MagicType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurseTest {

    Curse curse;

    @Before
    public void before(){
        curse=new Curse(10, MagicType.FIRE, "hell flame");
    }

    @Test
    public void curseHasType(){
        assertEquals(MagicType.FIRE, curse.getMagicType());
    }

}
