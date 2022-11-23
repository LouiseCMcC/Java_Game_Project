package magics;

public abstract class Magic {
    private int damage;
    private MagicType magicType;
    private String name;

    public Magic(int damage, MagicType magicType, String name){
        this.damage=damage;
        this.magicType=magicType;
        this.name=name;
    }

    public int getDamage() {
        return damage;
    }

    public MagicType getMagicType() {
        return magicType;
    }

    public String getName() {
        return name;
    }
}
