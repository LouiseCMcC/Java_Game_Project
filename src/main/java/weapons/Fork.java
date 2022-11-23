package weapons;

public class Fork extends Weapon{
    private WeaponType weaponType;

    public Fork(int damage, String name){
        super(damage, name);
        this.weaponType=WeaponType.PIERCING;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
