package monster;

/**
 * Represent a monster
 * @author Xian Yao Ng
 */
public enum Monster {
    GREENGOBLIN("Green goblin", "Goblin", 1, 8, 2, 2, 2),
    REDGOBLIN("Red goblin", "Goblin", 2, 12, 3, 2, 2),
    BLACKGOBLIN("Black goblin", "Goblin", 3, 15, 4, 3, 2),
    GOLDGOBLIN("Gold goblin", "Goblin", 5, 20, 7, 5, 2),
    GOBLINBOSS("Goblin boss", "Goblin", 100, 1000, 1000, 1000, 1000),
    BANDIT("Bandit", "Human", 6, 22, 10, 5, 3);

    private final String name;
    private final String species;
    private final int level;
    private final int health;
    private final int attack;
    private final int defense;
    private final int attackSpeed;

    /**
     * Creates a monster object with the specified monster's name, species of the monster,
     * level of monster, health value of monster, attack value of monster, defense value of monster,
     * and attack speed of monster
     * @param name The name of the monster
     * @param species The species of the monster
     * @param level The level of the monster
     * @param health The health of the monster
     * @param attack The attack of the monster
     * @param defense The defense of the monster
     * @param attackSpeed The attack speed of the monster
     */
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

    /**
     * Print out the info of monster
     */
    public void printInfo() {
        System.out.println("Monster Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Level: " + this.level);
        System.out.println("Health: " + this.health);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        System.out.println("Attack speed: " + this.attackSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
