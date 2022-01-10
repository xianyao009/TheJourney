/**
 * Represents a weapon
 * @author Xian Yao Ng
 */
public enum Weapon {
    WOODENSWORD("Wooden sword", "Common", 3, 2),
    WOODENAXE("Wooden axe", "Common", 4, 1),
    GOLDENSWORD("Golden sword", "rare", 10, 5),
    GOLDENAXE("Golden axe", "rare", 12, 3);

    private final String name;
    private final String rarity;
    private final int attack;
    private final int attackSpeed;

    /**
     *Creates a weapon object with the specified weapon's name, rarity, attack value, and attack speed value
     * @param name The name of the weapon
     * @param rarity The rarity of the weapon (How rare is the weapon)
     * @param attack The attack of the weapon
     * @param attackSpeed The attack speed of the weapon
     */
    Weapon(final String name, final String rarity, final int attack, final int attackSpeed) {
        this.name = name;
        this.rarity = rarity;
        this.attack = attack;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public int getAttack() {
        return attack;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    /**
     * Print out the info of weapon
     */
    public void printInfo() {
        System.out.println("Weapon Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Weapon name: " + this.name);
        System.out.println("Rarity: " + this.rarity);
        System.out.println("Attack: " + this.attack);
        System.out.println("Attack Speed: " + this.attackSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
