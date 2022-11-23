package enemies;

import behaviours.IDamageType;

public class Troll extends Enemy implements IEnemyAttack{

    public Troll(int healthPoints, IDamageType weakness){
        super(healthPoints, weakness);
    }

    @Override
    public void attack() {

    }
}
