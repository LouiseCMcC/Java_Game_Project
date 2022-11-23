package characterTests;

import characters.Barbarian;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Club club;

    @Before
    public void before(){
        barbarian=new Barbarian("Conan", 100, 200);
        club= new Club(10, "wood club");
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }
    
    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void hasTreasure(){
        assertEquals(200, barbarian.getTreasure());
    }

    @Test
    public void canReduceHealthPoints(){
        barbarian.changeHealthPoints(10);
        assertEquals(90, barbarian.getHealthPoints());
    }

    @Test
    public void canAddHealthPoints(){
        barbarian.changeHealthPoints(-10);
        assertEquals(110, barbarian.getHealthPoints());
    }

    @Test
    public void canAddTreasure(){
        barbarian.changeTreasure(25);
        assertEquals(225, barbarian.getTreasure());
    }

    @Test
    public void canReduceTreasure(){
        barbarian.changeTreasure(-25);
        assertEquals(175, barbarian.getTreasure());
    }

    @Test
    public void canAddWeapon(){
        barbarian.addWeapon(club);
        assertEquals(1, barbarian.getWeapons().size());
    }

    @Test
    public void canSetWeapon(){
        barbarian.addWeapon(club);
        barbarian.setWeapon(club);
        assertEquals("wood club", barbarian.getWeapon().getName());
    }

    @Test
    public void cantSetWeaponIfNotOwned(){
        barbarian.setWeapon(club);
        assertEquals(null, barbarian.getWeapon());
    }

    @Test
    public void canGetBaseDamageWithNoWeapon(){
        assertEquals(1, barbarian.getBaseDamage());
    }

    @Test
    public void canGetBaseDamageWithWeapon(){
        barbarian.addWeapon(club);
        barbarian.setWeapon(club);
        assertEquals(10, barbarian.getBaseDamage());
    }
}
