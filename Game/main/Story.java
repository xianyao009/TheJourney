package main;

import character.Character;
import combat.Battle;
import equipment.Weapon;
import monster.Monster;

import java.util.*;

/**
 * Main.Main story line of game
 * @author Xian Yao Ng
 */
public class Story {
	Main main;
	String choice = "";	// a temporary variable to store the choice of player
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
		text = "\nNice to meet you, " + character.getName() + "! Now pick your weapon!\n";
		delayPrint(50);

		label:
		do {
			text = "Do you want a sword or an axe?\nEnter '1' to pick \"Wooden sword\", '2' to pick \"Wooden axe\" or '3' to view the stats of the weapons: ";
			delayPrint(50);
			choice = scan.nextLine();
			switch (choice) {
				case "1":
					character.getInventory().addWeapon(Weapon.WOODENSWORD);
					character.equipWeapon(Weapon.WOODENSWORD);
					break label;
				case "2":
					character.getInventory().addWeapon(Weapon.WOODENAXE);
					character.equipWeapon(Weapon.WOODENAXE);
					break label;
				case "3":
					Weapon.WOODENSWORD.printInfo();
					Weapon.WOODENAXE.printInfo();
					break;
				default:
					System.out.println("\nPlease enter '1', '2' or '3' only!");
					break;
			}
		} while (true);

		text = "\nNice choice! Now, go take some rest. You'll start your journey the next day.";
		delayPrint(50);
    }
	
	// Main body of the game
	public void body() {
		Scanner scan = new Scanner(System.in);
		text = ".\n.\n.\n.\n.\n.\n";
		delayPrint(200);
		text = "You encountered a Green goblin!";
		delayPrint(50);
		Battle battle = new Battle(character, Monster.GREENGOBLIN);
		while(battle.battleStatus()) {
			battle.printBattleDetails();
			text = "What will you do?\n1. Attack | 2. Inventory\nEnter '1' to attack or '2' to open your inventory: ";
			delayPrint(50);
			choice = scan.nextLine();
			if (choice.equals("1")) {
				text = battle.attack();
				delayPrint(50);
			} else if (choice.equals("2")) {
				//battle.openInventory();
				text = "Will implement the open inventory feature in the future...\n";
				delayPrint(50);
				break;
			}
		}
		if (!battle.battleStatus()) {
			text = battle.died() + " died!\n";
			delayPrint(50);
		}
		text = "It's 11:52pm.... I need to go to bed... By Xian Yao Ng";
		delayPrint(50);
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