import java.util.*;

public class Main{

    static void introduction(){
        System.out.println("Welcome to The Journey. Please enjoy the game!\n");
        System.out.println("Enter 's' to view your character's stat.\nEnter 'w' to view your weapon's info.\nEnter 'a' to view your armor's info." );
    }


    public static void createCharacter(Character character, Weapon weapon, Armor armor){
        Scanner scan = new Scanner(System.in);
        System.out.println("Create your character...");
        System.out.print("What is your name?: ");
        character.name = scan.nextLine();
        System.out.println("Hey " + character.name + "! Pick your weapon!");
        System.out.print("Enter 1 or 2:\n[1] Sword\n[2] Axe\n");
        weapon.name = scan.nextLine();
        if(weapon.name.equals("1")){
            weapon.name = "Plastic Sword";
            weapon.type = "One handed sword";
            weapon.rarity = "Common";
            weapon.description = "A sword made of plastic.";
            weapon.attack = 2;
            weapon.attackSpeed = 2;
            System.out.println("You obtained Plastic Sword!");
        }else if(weapon.name.equals("2")){
            weapon.name = "Plastic Axe";
            weapon.type = "One handed axe";
            weapon.rarity = "Common";
            weapon.description = "An axe made of plastic.";
            weapon.attack = 3;
            weapon.attackSpeed = 1;
            System.out.println("You obtained Plastic Axe!");
        }
        
        character.equipWeapon(weapon);
        
    }

    public static void main(String[]args){
        introduction();
        Weapon weapon = new Weapon("Unknown", "Unknown", "Unknown", "Unknown", 0, 0);
        Armor armor = new Armor("Unknown", "Unknown", "Unknown", "Unknown", 0);
		Item item = new Item(" ", " "," "," ");
        Character char1 = new Character(" ", "Human", 1, 10, 0, 0, 0, weapon, armor);
        createCharacter(char1, weapon, armor);
        Scanner scan = new Scanner(System.in);
        char1.printInfo();
        weapon.printInfo();
		item.printInfo();
        armor.printInfo();
        Monster mon1 = new Monster(" ", " ", 0, 0, 0, 0, 0);
        mon1.name = "Snail";
        mon1.race = "aaa";
        mon1.printInfo();


    }
}