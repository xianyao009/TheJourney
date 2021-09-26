public class Weapon extends Item{
    int attack; 
    int attackSpeed; 
	

    public Weapon(String name, String type, String rarity, String description, int attack, int attackSpeed){
        super(name, type, rarity, description);
        this.attack = attack;
        this.attackSpeed = attackSpeed;
    }
    
	@Override
    public void printInfo(){
        System.out.println("Weapon Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Weapon name: " + name);
        System.out.println("Weapon description: " + description);
        System.out.println("Weapon type: " + type);
        System.out.println("Rarity: " + rarity);
        System.out.println("Attack: " + attack);
        System.out.println("Attack Speed: " + attackSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }




}