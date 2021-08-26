public class Character extends LivingThing{
    int attack;
    int attackSpeed;
    int defense;
    String charClass;



    public Character(String name, String type, int level, int health, Weapon weapon, Armor armor){
        super(name, type, level, health);
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

    public void characterInfo(){
        printInfo();
        System.out.println("Attack: " + attack);
        System.out.println("Attack speed: " + attackSpeed);
        System.out.println("Defense: " + defense);
        System.out.println("Class: " + charClass);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}