package enemyTests;

import behaviours.IDamageType;
import enemies.Hydra;
import magics.MagicType;
import org.junit.Before;
import org.junit.Test;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class HydraTest {
    Hydra hydra;

    @Before
    public void before(){
        hydra= new Hydra(30, MagicType.LIGHTNING);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(30, hydra.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        hydra.takeDamage(10);
        assertEquals(20, hydra.getHealthPoints());
    }

//    @Test
//    public void getBaseDamage(){
//        assertEquals(10, hydra.getDamage());
//    }
}
