package characterTests;

import characters.Barbarian;
import characters.Cleric;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Tool;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Tool potion;

    @Before
    public void before(){
        cleric=new Cleric("Cadfael", 100, 200);
        potion= new Tool(10, "healing potion");
    }

    @Test
    public void hasName(){
        assertEquals("Cadfael", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasTreasure(){
        assertEquals(200, cleric.getTreasure());
    }

    @Test
    public void canReduceHealthPoints(){
          cleric.changeHealthPoints(10);
        assertEquals(90, cleric.getHealthPoints());
    }

    @Test
    public void canAddHealthPoints(){
        cleric.changeHealthPoints(-10);
        assertEquals(110,  cleric.getHealthPoints());
    }

    @Test
    public void canAddTreasure(){
        cleric.changeTreasure(25);
        assertEquals(225, cleric.getTreasure());
    }

    @Test
    public void canReduceTreasure(){
        cleric.changeTreasure(-25);
        assertEquals(175,  cleric.getTreasure());
    }

    @Test
    public void canAddTool(){
        cleric.addTool(potion);
        assertEquals(1, cleric.getTools().size());
    }

    @Test
    public void canSetTool(){
        cleric.addTool(potion);
        cleric.setTool(potion);
        assertEquals("healing potion", cleric.getTool().getName());
    }

    @Test
    public void cantSetToolIfNotOwned(){
        cleric.setTool(potion);
        assertEquals(null, cleric.getTool());
    }

    @Test
    public void canGetBaseHealWithNoTool(){
        assertEquals(1, cleric.getBaseHeal());
    }

    @Test
    public void canGetBaseHealWithTool(){
        cleric.addTool(potion);
        cleric.setTool(potion);
        assertEquals(10, cleric.getBaseHeal());
    }
}
