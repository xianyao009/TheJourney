public class Character {
    private EquipmentTab equipmentTab;
    private Inventory inventory;
    private String name;
    private String race;
    private String charClass;
    private int level;
    private int health;
    private int attack;
    private int defense;
    private int attackSpeed;

    public Character() {
        this.equipmentTab = new EquipmentTab(null, null);
        this.inventory = new Inventory();
        this.name = "???";
        this.race = "Human";
        this.charClass = "Civilian";
        this.level = 1;
        this.health = 10;
        this.attack = 0;
        this.defense = 0;
        this.attackSpeed = 0;
    }

    public void equipWeapon(Weapon weapon) {
        this.equipmentTab.setWeapon(weapon);
        this.attack = weapon.getAttack();
        this.attackSpeed = weapon.getAttackSpeed();
    }

    public void equipArmor(Armor armor) {
        this.equipmentTab.setArmor(armor);
        this.defense = armor.getDefense();
    }

    public EquipmentTab getEquipmentTab() {
        return equipmentTab;
    }

    public void setEquipmentTab(EquipmentTab equipmentTab) {
        this.equipmentTab = equipmentTab;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void printInfo() {
        System.out.println("Character Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
		System.out.println("Class: " + charClass);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Attack speed: " + attackSpeed);
        System.out.println("Defense: " + defense);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}