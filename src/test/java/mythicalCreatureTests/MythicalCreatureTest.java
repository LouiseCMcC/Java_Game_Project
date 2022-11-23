package mythicalCreatureTests;

import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MythicalCreatureTest {

    MythicalCreature threeHeadedDog;

    @Before
    public void before(){
        threeHeadedDog= new MythicalCreature("cerebrus", 10, 20 );
    }

    @Test
    public void canGetName(){
        assertEquals("cerebrus", threeHeadedDog.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(20, threeHeadedDog.getHealthPoints());
    }

    @Test
    public void canGetBaseDamage(){
        assertEquals(10, threeHeadedDog.getDamage());
    }

}
