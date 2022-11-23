package enemies;

import behaviours.IDamageType;

public class OwlBear extends Enemy implements IEnemyAttack{

    public OwlBear(int healthPoints, IDamageType weakness){
        super(healthPoints, weakness);
    }

    @Override
    public void attack() {

    }
}
