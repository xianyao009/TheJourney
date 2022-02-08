package main;

import character.Character;
import combat.Battle;
import equipment.Armor;
import equipment.Weapon;
import item.Potion;
import monster.Monster;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Main story line of the game
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

		text = "\nNice choice!\nHere are some potions that can help you in the combat...\nYou obtained 3 Health potion!";
		delayPrint(50);
		IntStream.range(0, 3).forEach(i -> character.getInventory().addPotion(Potion.HEALTHPOTION));

		text = "\n*Summons a Green goblin*\nTry your new weapon by defeating the goblin!\n";
		delayPrint(50);
    }
	
	// Main body of the game
	public void body() {
		text = ".\n.\n.\n.\n.\n.\n";
		delayPrint(200);
		text = "You encountered a Green goblin!";
		delayPrint(50);
		Battle battle = new Battle(character, Monster.GREENGOBLIN);
		startBattle(battle);

		text = "Time to sleep... Xian Yao Ng";
		delayPrint(50);
	}

	/**
	 * Start the battle
	 * @param battle The battle between character and monster
	 */
	public void startBattle(Battle battle) {
		Scanner scan = new Scanner(System.in);
		while(battle.battleStatus()) {
			battle.printBattleDetails();
			text = "What will you do?\n1. Attack | 2. Use potion\nEnter '1' to attack or '2' to use potion: ";
			delayPrint(50);
			choice = scan.nextLine();
			if (choice.equals("1")) {
				text = battle.attack();
				delayPrint(50);
			} else if (choice.equals("2")) {
				if (battle.getCharacterRemainingHealth() >= character.getHealth()) {
					text = "You can't use potion when you're at full health!";
					delayPrint(50);
					continue;
				} else if (character.getInventory().getPotionMap().isEmpty()) {
					text = "You have used up all your potions!";
					delayPrint(50);
					continue;
				}
				battle.showPotion();
				text = "Which potion do you want to use?\nEnter the number correspondent to the potion to use it: ";
				delayPrint(50);
				choice = scan.nextLine();
				text = battle.usePotion(Integer.parseInt(choice));
				delayPrint(50);
				if (text.equals("Please enter only the number correspondent to the potion!\n")) {
					continue;
				}
				text = battle.monsterAttack();
				delayPrint(50);
			} else {
				text = "Please enter only the number correspondent to the action!\n";
			}
		}
		text = "\n" + battle.died() + " died!\n";
		delayPrint(50);
	}

	/**
	 * Causes the currently executing thread to sleep temporarily for the specified number of milliseconds.
	 * character.Character in a sentence will appear one by one, rather than appearing every single words at once.
	 * @param ms The time interval in milliseconds
	 */
	public void delayPrint(int ms) {
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