public class Item{
    String name; 
    String type; 
    String rarity; 
    String description; 

    public Item(String name, String type, String rarity, String description){
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.description = description;
    }

    public void printInfo(){
        System.out.println("Item Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Item name: " + name);
        System.out.println("Item description: " + description);
        System.out.println("Item type: " + type);
        System.out.println("Rarity: " + rarity);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}