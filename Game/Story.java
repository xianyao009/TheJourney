import java.util.*;

public class Story {
	Main main;
	String temp = "";	// a temporary variable to store the choice of player
	String text;	// text to print
	
	Character character = new Character();

	public Story(Main main) {
		this.main = main;
	}

	// Introduction of the game
	public void introduction() {
		Scanner scan = new Scanner(System.in);
		
		text = "Welcome to The Journey.\nFirst, please tell me your name.\nName: ";
		delayPrint();
		character.setName(scan.nextLine());
		text = "\nHi " + character.getName() + ", nice name! Now pick your weapon!\n";
		delayPrint();
		
		while(true) {
			text = "Do you want a sword or an axe?\nEnter '1' to pick \"Wooden sword\", '2' to pick \"Wooden axe\" or '3' to view the stats of the weapons: ";
			delayPrint();
			temp = scan.nextLine();
			if (temp.equals("1")) {
				character.getInventory().addWeapon(Weapon.WOODENSWORD);
				character.equipWeapon(Weapon.WOODENSWORD);
				break;
			} else if(temp.equals("2")) {
				character.getInventory().addWeapon(Weapon.WOODENAXE);
				character.equipWeapon(Weapon.WOODENAXE);
				break;
			} else if(temp.equals("3")) {
				Weapon.WOODENSWORD.printInfo();
				Weapon.WOODENAXE.printInfo();
			} else {
				System.out.println("\nPlease enter '1', '2' or '3' only!");
			}
		}
		
		text = "\nNice choice! Now, go take some rest. You'll start your journey the next day.";
		delayPrint();
    }
	
	// Main body of the game
	public void body() {
		text = ".\n.\n.\n.\n.\n.\n.\n";
		delayPrintSlower();
		text = "You encountered a Goblin!";
		delayPrint();
		System.out.println("\nBusyyyyyyyyyyyy");

		
	}
	
	/* Causes the currently executing thread to sleep temporarily for the specified number of milliseconds
	   Character in a sentence will appear one by one */
	public void delayPrint() {
		// System.out.println(text);
		for(char c : text.toCharArray()){
			System.out.print(c);
			try{
				Thread.sleep(50);    // time interval in milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// Longer sleep
	public void delayPrintSlower() {
		for(char c : text.toCharArray()) {
			System.out.print(c);
			try {
				Thread.sleep(250);    // time interval in milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}