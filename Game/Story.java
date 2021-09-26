import java.util.*;
public class Story{
	Main main;
	static Character character = new Character();
	// Monster monster = new Monster();
	
	public Story(Main main){
		this.main = main;
	}
	
	static void introduction(){
		String text1 = "Welcome to The Journey, a text-based adventure game created by Xian Yao Ng.\nFirst, please tell me your name.\nName: ";
		for(char c : text1.toCharArray()){
			System.out.print(c);
			delay();
		}
		Scanner scan = new Scanner(System.in);
		character.name = scan.nextLine();
		String text2 = "Nice name! Your journey starts here and please enjoy the game!\n";
		System.out.println("Hi " + character.name + "!");
		for(char c : text2.toCharArray()){
			System.out.print(c);
			delay();
		}
        // System.out.println("Welcome to The Journey. Please enjoy the game!");
		// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// System.out.println("NOTE: YOU CAN ALWAYS ENTER:- ");
        // System.out.println("'s': View your character's stat.\n'w': View your weapon's info.\n'a': view your armor's info." );
    }
	
	
	/* Causes the currently executing thread to sleep temporarily for the specified number of milliseconds
	   Character in a sentence will appear one by one */
	static void delay(){
		try{
			Thread.sleep(60);    // time interval in milliseconds
		}catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	// public static void createCharacter(){
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Create your character...");
        // System.out.print("What is your name?: ");
        // character.name = scan.nextLine();
        // System.out.println("Hey " + character.name + "! Pick your weapon!");
        // System.out.print("Enter 1 or 2:\n[1] Sword\n[2] Axe\n");
        // weapon.name = scan.nextLine();
        // if(weapon.name.equals("1")){
            // weapon.name = "Plastic Sword";
            // weapon.type = "One handed sword";
            // weapon.rarity = "Common";
            // weapon.description = "A sword made of plastic.";
            // weapon.attack = 2;
            // weapon.attackSpeed = 2;
            // System.out.println("You obtained Plastic Sword!");
        // }else if(weapon.name.equals("2")){
            // weapon.name = "Plastic Axe";
            // weapon.type = "One handed axe";
            // weapon.rarity = "Common";
            // weapon.description = "An axe made of plastic.";
            // weapon.attack = 3;
            // weapon.attackSpeed = 1;
            // System.out.println("You obtained Plastic Axe!");
        // }
        
        // character.equipWeapon(weapon);
        
    // }
}