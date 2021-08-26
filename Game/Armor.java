public class Armor extends Item{
    int defense;

    public Armor(String name, String type, String rarity, String details, int defense){
        super(name, type, rarity, details);
        this.defense = defense;
    }

    public void armorInfo(){
        printInfo();
        System.out.println("Defense: " + defense);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}