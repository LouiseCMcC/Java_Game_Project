package weaponAndMagicTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club=new Club(10, "wood club");
    }

    @Test
    public void getDamageType(){
        assertEquals(WeaponType.BLUNT, club.getWeaponType());
    }
}
