package weaponAndMagicTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class SwordTest {


    Sword sword;

    @Before
    public void before(){
        sword=new Sword(10, "wood sword");
    }

    @Test
    public void getDamageType(){
        assertEquals(WeaponType.SLASHING, sword.getWeaponType());
    }
}

