package enemies;

import behaviours.IDamageType;

public class Hydra extends Enemy implements IEnemyAttack {

    public Hydra(int healthPoints, IDamageType weakness){
        super(healthPoints, weakness);

    }

    @Override
    public void attack() {

    }


}

