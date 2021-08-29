public class Armor extends Item{
    int defense; 

    public Armor(String name, String type, String rarity, String description, int defense){
        super(name, type, rarity, description);
        this.defense = defense;
    }

	@Override
    public void printInfo(){
        System.out.println("Armor Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Armor name: " + name);
        System.out.println("Armor description: " + description);
        System.out.println("Armor type: " + type);
        System.out.println("Rarity: " + rarity);
        System.out.println("Defense: " + defense);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}