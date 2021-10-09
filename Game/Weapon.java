public class Weapon extends Item{
    int attack; 
    int attackSpeed; 
	

    public Weapon(String name, String description, int attack, int attackSpeed){
        super(name, description);
        this.attack = attack;
        this.attackSpeed = attackSpeed;
    }
	
	@Override
    public void printInfo(){
		System.out.println("\n");
        System.out.println("Weapon Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Weapon name: " + name);
        System.out.println("Weapon description: " + description);
        System.out.println("Attack: " + attack);
        System.out.println("Attack Speed: " + attackSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}