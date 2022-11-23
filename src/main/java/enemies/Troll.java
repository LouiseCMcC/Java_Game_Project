package enemies;

import behaviours.IDamageType;

public class Troll extends Enemy implements IEnemyAttack{

    public Troll(String name, int healthPoints, IDamageType weakness){
        super(name, healthPoints, weakness);
    }

    @Override
    public void attack() {

    }
}
