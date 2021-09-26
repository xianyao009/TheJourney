public class LivingThing{
    String name;
    String race;
    int level;
    int health;
    int attack;
    int attackSpeed;
    int defense;
	boolean alive;


    // public LivingThing(String name, String race, int level, int health, int attack, int attackSpeed, int defense){
        // this.name = name;
        // this.race = race;
        // this.level = level;
        // this.health = health;
        // this.attack = attack;
        // this.attackSpeed = attackSpeed;
        // this.defense = defense;
		// this.alive = true;
    // }

    public void printInfo(){
        System.out.println("Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Attack speed: " + attackSpeed);
        System.out.println("Defense: " + defense);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}