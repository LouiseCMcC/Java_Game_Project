package weaponAndMagicTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Fork;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class ForkTest {

    Fork fork;

    @Before
    public void before(){
        fork=new Fork(10, "wood fork");
    }

    @Test
    public void getDamageType(){
        assertEquals(WeaponType.PIERCING, fork.getWeaponType());
    }
}

