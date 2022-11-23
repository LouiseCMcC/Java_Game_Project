package enemies;

import behaviours.IDamageType;

public class Hydra extends Enemy implements IEnemyAttack {

    public Hydra(String name, int healthPoints, IDamageType weakness){
        super(name, healthPoints, weakness);
    }

    @Override
    public void attack() {

    }
}

