public class Item{
    String name;  
    String description; 

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void printInfo(){
        System.out.println("Item Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Item name: " + name);
        System.out.println("Item description: " + description);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}