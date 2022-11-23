package enemies;

import behaviours.IDamageType;

public class OwlBear extends Enemy implements IEnemyAttack{

    public OwlBear(String name, int healthPoints, IDamageType weakness){
        super(name, healthPoints, weakness);
    }

    @Override
    public void attack() {

    }
}
