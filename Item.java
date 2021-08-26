public class Item{
    String name;
    String type;
    String rarity;
    String details;

    public Item(String name, String type, String rarity, String details){
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.details = details;
    }

    public void printInfo(){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Item Info");
        System.out.println("Item name: " + name);
        System.out.println("Item type: " + type);
        System.out.println("Rarity: " + rarity);
        System.out.println("Item description: " + details);
    }
}