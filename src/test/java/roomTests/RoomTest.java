package roomTests;

import behaviours.IDamageType;
import characters.*;
import enemies.Hydra;
import enemies.OwlBear;
import enemies.Troll;
import magics.Curse;
import magics.Spell;
import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;
import weapons.*;

public class RoomTest {
    Room room;
    Dwarf dwarf;
    Barbarian barbarian;
    Knight knight;
    Warlock warlock;
    Wizard wizard;
    Cleric cleric;
    MythicalCreature mythicalCreature;
    Troll troll;
    Hydra hydra;
    OwlBear owlBear;
    Club club;
    Fork fork;
    Sword sword;
    Spell spell;
    Curse curse;
    Tool tool;
    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", 100, 200);
        troll= new Troll(20, WeaponType.BLUNT);
        fork = new Fork(10, "wood fork");
        dwarf.addWeapon(fork);
        room = new Room();
        room.addEnemy(troll);


    }

    @Test
    public void canResolveFight(){
        room.encounter(dwarf);

    }
}
