public class LivingThing{
    String name;
    String type;
    int level;
    int health;


    public LivingThing(String name, String type, int level, int health){
        this.name = name;
        this.type = type;
        this.level = level;
        this.health = health;
    }

    public void printInfo(){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Info");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
    }
}