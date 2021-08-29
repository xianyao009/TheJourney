public class Character extends LivingThing{
    String charClass;

    public Character(String name, String race, int level, int health, int attack, int attackSpeed, int defense, Weapon weapon, Armor armor){
        super(name, race, level, health, attack, attackSpeed, defense);
        this.attack = weapon.attack;
        this.attackSpeed = weapon.attackSpeed;
        this.defense = armor.defense;
        this.charClass = "Civilian";
    }

    public void equipWeapon(Weapon weapon){
        this.attack = weapon.attack;
        this.attackSpeed = weapon.attackSpeed;
    }

    public void equipArmor(Armor armor){
        this.defense = armor.defense;
    }

    @Override
    public void printInfo(){
        System.out.println("Character Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Attack speed: " + attackSpeed);
        System.out.println("Defense: " + defense);
        System.out.println("Class: " + charClass);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}