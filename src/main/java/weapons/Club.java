package weapons;

public class Club extends Weapon{
    private WeaponType weaponType;

    public Club(int damage, String name){
        super(damage, name);
        this.weaponType=WeaponType.BLUNT;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
