public enum Monster {
    GREENGOBLIN("Green goblin", "Goblin", 1, 8, 2, 2, 2),
    REDGOBLIN("Red goblin", "Goblin", 2, 12, 3, 2, 2),
    BLACKGOBLIN("Black goblin", "Goblin", 3, 15, 4, 3, 2),
    GOLDGOBLIN("Gold goblin", "Goblin", 5, 20, 7, 5, 4),
    GOBLINBOSS("Goblin boss", "Goblin", 100, 1000, 1000, 1000, 1000);

    private final String name;
    private final String species;
    private final int level;
    private final int health;
    private final int attack;
    private final int defense;
    private final int attackSpeed;

    Monster(final String name, final String species, final int level, final int health, final int attack, final int defense, final int attackSpeed) {
        this.name = name;
        this.species = species;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }


}
