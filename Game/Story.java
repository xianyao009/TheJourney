import java.util.*;

public class Story{
	Main main;
	String temp = "";	// a temporary variable to store the choice of player
	String text;	// text to print
	
	Character character = new Character(" ", "Human", 1, 10, 999, 999, 0, false, "Civilian");
	EquipmentTab equipment = new EquipmentTab(character);
	
	Weapon sword = new Weapon("Sword", "A sword made of iron", 3, 2);
	Weapon axe = new Weapon("Axe", "An axe made of iron", 4, 1);
	
	Armor plateArmour = new Armor("Steel plate armour", "A Plate armour made of steel.", 10);
	
	Monster goblin = new Monster("Green Goblin", "Goblin", 1, 10, 2, 1, 1, false);
	
	
	public Story(Main main){
		this.main = main;
	}

	// Introduction of the game
	public void introduction(){
		Scanner scan = new Scanner(System.in);
		
		text = "Welcome to The Journey, a text-based adventure game created by Xian Yao Ng.\nFirst, please tell me your name.\nName: ";
		delayPrint();
		character.name = scan.nextLine();
		text = "\nHi " + character.name + ", nice name! Now pick your weapon!\n";
		delayPrint();
		
		while(true){
			text = "Do you want a sword or an axe?\nEnter '1' for sword, '2' for axe or '3' to view the stats of the weapons: ";
			delayPrint();
			temp = scan.nextLine();
			if(temp.equals("1") || temp.equals("2")){
				break;
			}else if(temp.equals("3")){
				sword.printInfo();
				axe.printInfo();
			}else{
				System.out.println("\nPlease enter '1', '2' or '3' only!");
			}
		}
		
		if(temp.equals("1")){
			equipment.equipWeapon(sword);
		}else if(temp.equals("2")){
			equipment.equipWeapon(axe);
		}
		
		text = "\nNice choice! Now, go take some rest. You'll start your journey the next day.";
		delayPrint();
    }
	
	// Main body of the game
	public void body(){
		text = ".\n.\n.\n.\n.\n.\n.\n";
		delayPrintSlower();
		text = "You encountered a Goblin!";
		delayPrint();
		System.out.println("\njk, 2 midterms next week, will come back after the midterm :)");
		// while(character.health != 0){
			// Combat combat = new Combat(character, goblin);
			// combat.start(character, goblin);
		// }
		
	}
	
	/* Causes the currently executing thread to sleep temporarily for the specified number of milliseconds
	   Character in a sentence will appear one by one */
	public void delayPrint(){
		// System.out.println(text);
		for(char c : text.toCharArray()){
			System.out.print(c);
			try{
				Thread.sleep(50);    // time interval in milliseconds
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// Longer sleep
	public void delayPrintSlower(){
		for(char c : text.toCharArray()){
			System.out.print(c);
			try{
				Thread.sleep(300);    // time interval in milliseconds
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}