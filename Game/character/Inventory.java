package character;

import equipment.Armor;
import equipment.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an inventory (act like a backpack to store items)
 * @author Xian Yao Ng
 */
public class Inventory {
    private final List<Weapon> weaponList;
    private final List<Armor> armorList;
    //private List<Potion> potionList;
    //private List<Usable> usableList;

    /**
     * Creates an Inventory object
     */
    public Inventory() {
        this.weaponList = new ArrayList<>();
        this.armorList = new ArrayList<>();
//        this.potionList = new ArrayList<>();
    }

    /**
     * Gets the list of weapon the character owned
     * @return An ArrayList representing the list of weapon the character owned
     */
    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    /**
     * Gets the list of armor the character owned
     * @return An ArrayList representing the list of armor the character owned
     */
    public List<Armor> getArmorList() {
        return armorList;
    }

//    public List<Potion> getPotionList() {
//        return potionList;
//    }

//    public List<Usable> getUsableList() {
//        return usableList;
//    }

    /**
     * Add weapon into the inventory (ArrayList)
     * @param weapon The weapon to be added into the inventory (ArrayList)
     */
    public void addWeapon(Weapon weapon) {
        this.weaponList.add(weapon);
    }

    /**
     * Add armor into the inventory (ArrayList)
     * @param armor The armor to be added into the inventory (ArrayList)
     */
    public void addArmor(Armor armor) {
        this.armorList.add(armor);
    }

    /**
     * Print out the info of inventory
     */
    public void printInfo() {
        int count = 1;
        System.out.println("\nInventory");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Weapon in inventory: ");
        for (Weapon  w : weaponList) {
            System.out.println(count + ". " + w.getName());
            count++;
        }
        count = 1;
        System.out.println("\nArmor in inventory: ");
        for (Armor  a : armorList) {
            System.out.println(count + "." + a.getName());
            count++;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

//    public void addPotion(Potion potion) {
//        this.potionList.add(potion);
//    }

//    public void addUsable(Usable usable) {
//        this.usableList.add(usable);
//    }
}
