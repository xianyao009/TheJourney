public class Weapon extends Item{
    int attack;
    int attackSpeed;

    public Weapon(String name, String type, String rarity, String details, int attack, int attackSpeed){
        super(name, type, rarity, details);
        this.attack = attack;
        this.attackSpeed = attackSpeed;
    }

    public void weaponInfo(){
        printInfo();
        System.out.println("Attack: " + attack);
        System.out.println("Attack Speed: " + attackSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }




}