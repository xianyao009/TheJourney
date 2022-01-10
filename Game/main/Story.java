package main;

import character.Character;
import equipment.Weapon;

import java.util.*;

/**
 * Main.Main story line of game
 * @author Xian Yao Ng
 */
public class Story {
	Main main;
	String temp = "";	// a temporary variable to store the choice of player
	String text;	// text to print
	
	Character character = new Character();

	public Story(Main main) {
		this.main = main;
	}

	/**
	 * Introduction of the game
	 */
	public void introduction() {
		Scanner scan = new Scanner(System.in);
		
		text = "Welcome to The Journey.\nFirst, please tell me your name.\nName: ";
		delayPrint(50);
		character.setName(scan.nextLine());
		text = "\nHi " + character.getName() + ", nice name! Now pick your weapon!\n";
		delayPrint(50);

		do {
			text = "Do you want a sword or an axe?\nEnter '1' to pick \"Wooden sword\", '2' to pick \"Wooden axe\" or '3' to view the stats of the weapons: ";
			delayPrint(50);
			temp = scan.nextLine();
			if (temp.equals("1")) {
				character.getInventory().addWeapon(Weapon.WOODENSWORD);
				character.equipWeapon(Weapon.WOODENSWORD);
				break;
			} else if (temp.equals("2")) {
				character.getInventory().addWeapon(Weapon.WOODENAXE);
				character.equipWeapon(Weapon.WOODENAXE);
				break;
			} else if (temp.equals("3")) {
				Weapon.WOODENSWORD.printInfo();
				Weapon.WOODENAXE.printInfo();
			} else {
				System.out.println("\nPlease enter '1', '2' or '3' only!");
			}
		} while (true);
		
		text = "\nNice choice! Now, go take some rest. You'll start your journey the next day.";
		delayPrint(50);
    }
	
	// Main.Main body of the game
	public void body() {
		text = ".\n.\n.\n.\n.\n.\n.\n";
		delayPrint(250);
		text = "You encountered a Goblin!";
		delayPrint(50);
		System.out.println("\nWill implement the Combat.Battle class soon....");
		
	}

	/**
	 * Causes the currently executing thread to sleep temporarily for the specified number of milliseconds.
	 * character.Character in a sentence will appear one by one, rather than appearing every single words at once.
	 * @param ms The time interval in milliseconds
	 */
	public void delayPrint(int ms) {
		// System.out.println(text);
		for(char c : text.toCharArray()) {
			System.out.print(c);
			try {
				Thread.sleep(ms);    // time interval in milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}