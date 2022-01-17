package character;

import equipment.Armor;
import equipment.Weapon;
import item.Potion;

import java.util.*;

/**
 * Represents an inventory (act like a backpack to store items)
 * @author Xian Yao Ng
 */
public class Inventory {
    private final List<Weapon> weaponList;
    private final List<Armor> armorList;
    private final Map<Potion, Integer> potionMap;
    //private List<Usable> usableList;

    /**
     * Creates an Inventory object
     */
    public Inventory() {
        this.weaponList = new ArrayList<>();
        this.armorList = new ArrayList<>();
        this.potionMap = new LinkedHashMap<>();
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

    public Map<Potion, Integer> getPotionMap() {
        return potionMap;
    }

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

    public void addPotion(Potion potion) {
        if (!potionMap.containsKey(potion)) {
            this.potionMap.put(potion, 1);
        } else {
            this.potionMap.put(potion, potionMap.get(potion) + 1);
        }
    }

    public void showPotion() {
        int count = 1;
        System.out.println("\nPotion in inventory: ");
        for (HashMap.Entry<Potion, Integer> p : potionMap.entrySet()) {
            System.out.println(count + ". " + p.getKey().getName() + " X" + p.getValue() + " " + p.getKey().getEffect());
            count++;
        }
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
            System.out.println(count + ". " + a.getName());
            count++;
        }

        count = 1;
        System.out.println("\nPotion in inventory: ");
        for (HashMap.Entry<Potion, Integer> p : potionMap.entrySet()) {
            System.out.println(count + ". " + p.getKey().getName() + " X" + p.getValue());
            count++;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

//    public void addUsable(Usable usable) {
//        this.usableList.add(usable);
//    }
}
