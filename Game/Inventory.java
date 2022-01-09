import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Weapon> weaponList;
    private final List<Armor> armorList;
    //private List<Potion> potionList;

    public Inventory() {
        this.weaponList = new ArrayList<>();
        this.armorList = new ArrayList<>();
//        this.potionList = new ArrayList<>();
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public List<Armor> getArmorList() {
        return armorList;
    }

//    public List<Potion> getPotionList() {
//        return potionList;
//    }

    public void addWeapon(Weapon weapon) {
        this.weaponList.add(weapon);
    }

    public void addArmor(Armor armor) {
        this.armorList.add(armor);
    }

//    public void addPotion(Potion potion) {
//        this.potionList.add(potion);
//    }
}
