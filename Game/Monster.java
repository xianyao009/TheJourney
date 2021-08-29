class Monster extends LivingThing{

    public Monster(String name, String race, int level, int health, int attack, int attackSpeed, int defense){
        super(name, race, level, health, attack, attackSpeed, defense);
    }

    @Override
    public void printInfo(){
        System.out.println("Monster Info");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Attack speed: " + attackSpeed);
        System.out.println("Defense: " + defense);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}