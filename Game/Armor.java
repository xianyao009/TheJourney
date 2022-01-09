public enum Armor {
    WHITETSHIRT("White T-shirt", "Common", 1),
    PLATEARMOUR("Plate armour", "Common", 4),
    GOLDENPLATEARMOUR("Golden plate armour", "rare", 10);

    private final String name;
    private final String rarity;
    private final int defense;

    Armor(final String name, final String rarity, final int defense) {
        this.name = name;
        this.rarity = rarity;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public int getDefense() {
        return defense;
    }
}
