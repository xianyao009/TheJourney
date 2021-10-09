public class Character extends LivingThing{
    String charClass;

    public Character(String name, String race, int level, int health, int attack, int attackSpeed, int defense, boolean combatStatus, String charClass){
		super(name, race, level, health, attack, attackSpeed, defense, combatStatus);
		this.charClass = charClass;
    }

    @Override
    public void printInfo(){
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