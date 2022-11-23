package characterTests;

import characters.Barbarian;
import characters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Fork;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Fork fork;

    @Before
    public void before(){
        dwarf=new Dwarf("Gimli", 100, 200);
        fork= new Fork(10, "wood fork");
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasTreasure(){
        assertEquals(200, dwarf.getTreasure());
    }

    @Test
    public void canReduceHealthPoints(){
        dwarf.changeHealthPoints(10);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void canAddHealthPoints(){
        dwarf.changeHealthPoints(-10);
        assertEquals(110, dwarf.getHealthPoints());
    }

    @Test
    public void canAddTreasure(){
        dwarf.changeTreasure(25);
        assertEquals(225, dwarf.getTreasure());
    }

    @Test
    public void canReduceTreasure(){
        dwarf.changeTreasure(-25);
        assertEquals(175, dwarf.getTreasure());
    }

    @Test
    public void canAddWeapon(){
        dwarf.addWeapon(fork);
        assertEquals(1, dwarf.getWeapons().size());
    }

    @Test
    public void canSetWeapon(){
        dwarf.addWeapon(fork);
        dwarf.setWeapon(fork);
        assertEquals("wood fork", dwarf.getWeapon().getName());
    }

    @Test
    public void cantSetWeaponIfNotOwned(){
        dwarf.setWeapon(fork);
        assertEquals(null, dwarf.getWeapon());
    }

    @Test
    public void canGetBaseDamageWithNoWeapon(){
        assertEquals(1, dwarf.getBaseDamage());
    }

    @Test
    public void canGetBaseDamageWithWeapon(){
        dwarf.addWeapon(fork);
        dwarf.setWeapon(fork);
        assertEquals(10, dwarf.getBaseDamage());
    }
}

