/**
 * Represents an armor
 * @author Xian Yao Ng
 */
public enum Armor {
    WHITETSHIRT("White T-shirt", "Common", 1),
    PLATEARMOUR("Plate armour", "Common", 4),
    GOLDENPLATEARMOUR("Golden plate armour", "rare", 10);

    private final String name;
    private final String rarity;
    private final int defense;

    /**
     *Creates an armor object with the specified armor's name, rarity and defense value
     * @param name The name of the armor
     * @param rarity The rarity of the armor (How rare is the armor)
     * @param defense The defense of the armor
     */
    Armor(final String name, final String rarity, final int defense) {
        this.name = name;
        this.rarity = rarity;
        this.defense = defense;
    }

    /**
     * Gets the armor's name.
     * @return A string representing the armor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the armor's rarity
     * @return A string representing the armor's rarity
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * Gets the armor's defense value
     * @return An integer representing the armor's defense value
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Print out the info of armor
     */
    public void printInfo() {
        System.out.println("Armor Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Armor name: " + this.name);
        System.out.println("Rarity: " + this.rarity);
        System.out.println("Defense: " + this.defense);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
