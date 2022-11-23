package characterTests;

import characters.Dwarf;
import characters.Knight;
import org.junit.Before;
import org.junit.Test;
import weapons.Fork;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;

    @Before
    public void before(){
        knight=new Knight("Galahad", 100, 200);
        sword= new Sword(10, "wood sword");
    }

    @Test
    public void hasName(){
        assertEquals("Galahad", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasTreasure(){
        assertEquals(200, knight.getTreasure());
    }

    @Test
    public void canReduceHealthPoints(){
        knight.changeHealthPoints(10);
        assertEquals(90, knight.getHealthPoints());
    }

    @Test
    public void canAddHealthPoints(){
        knight.changeHealthPoints(-10);
        assertEquals(110, knight.getHealthPoints());
    }

    @Test
    public void canAddTreasure(){
        knight.changeTreasure(25);
        assertEquals(225, knight.getTreasure());
    }

    @Test
    public void canReduceTreasure(){
        knight.changeTreasure(-25);
        assertEquals(175, knight.getTreasure());
    }

    @Test
    public void canAddWeapon(){
        knight.addWeapon(sword);
        assertEquals(1, knight.getWeapons().size());
    }

    @Test
    public void canSetWeapon(){
        knight.addWeapon(sword);
        knight.setWeapon(sword);
        assertEquals("wood sword", knight.getWeapon().getName());
    }

    @Test
    public void cantSetWeaponIfNotOwned(){
        knight.setWeapon(sword);
        assertEquals(null, knight.getWeapon());
    }

    @Test
    public void canGetBaseDamageWithNoWeapon(){
        assertEquals(1, knight.getBaseDamage());
    }

    @Test
    public void canGetBaseDamageWithWeapon(){
        knight.addWeapon(sword);
        knight.setWeapon(sword);
        assertEquals(10, knight.getBaseDamage());
    }
}

