package weapons;

public class Sword extends Weapon{
    private WeaponType weaponType;

    public Sword(int damage, String name){
        super(damage, name);
        this.weaponType= WeaponType.SLASHING;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
