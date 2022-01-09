public enum Weapon {
    WOODENSWORD("Wooden sword", "Common", 3, 2),
    WOODENAXE("Wooden axe", "Common", 4, 1),
    GOLDENSWORD("Golden sword", "rare", 10, 5),
    GOLDENAXE("Golden axe", "rare", 12, 3);

    private final String name;
    private final String rarity;
    private final int attack;
    private final int attackSpeed;

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

    public void printInfo() {
        System.out.println("\n");
        System.out.println("Weapon Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Weapon name: " + this.name);
        System.out.println("Rarity: " + this.rarity);
        System.out.println("Attack: " + this.attack);
        System.out.println("Attack Speed: " + this.attackSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
