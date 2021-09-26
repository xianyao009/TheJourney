import java.util.ArrayList;
public class Character extends LivingThing{
    String charClass;
	//Weapon currentWeapon;
	//ArrayList<String> skills;

    public Character(){
        //super(name, race, level, health, attack, attackSpeed, defense);
		//name = "add";
		race = "Human";
		level = 1;
		health = 10;
		//attack = 100;
		//attackSpeed = 12;
		//defense = 123;
        // attack = weapon.attack;
        // attackSpeed = weapon.attackSpeed;
        // defense = armor.defense;
        charClass = "Civilian";
		//skills = new ArrayList<String>();
    }

    // public void equipWeapon(Weapon weapon){
        // this.attack = weapon.attack;
        // this.attackSpeed = weapon.attackSpeed;
    // }

    // public void equipArmor(Armor armor){
        // this.defense = armor.defense;
    // }

	public void levelUp(){
		level += 1;
		health += 10;
		System.out.println("You leveled up! Your current level is Level " + level + ".");
		
	}

	// public void addSkill(String newSkill){
		// skills.add(newSkill);
	// }
	
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
		// System.out.println("Skills: ");
		// if(skills.isEmpty()){
			// System.out.println("N/A");
		// }else{
			// for(int i = 1; i <= skills.size(); i++){
				// System.out.println(i + ". " + skills.get(i - 1));
			// }
		// }	
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}