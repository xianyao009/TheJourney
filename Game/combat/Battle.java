package combat;

import monster.Monster;
import character.Character;

/**
 * @author Xian Yao Ng
 */
public class Battle {
    private final Character character;
    private final Monster monster;
    private int characterRemainingHealth;
    private int monsterRemainingHealth;

    public Battle(Character character, Monster monster) {
        this.character = character;
        this.monster = monster;
        this.characterRemainingHealth = character.getHealth();
        this.monsterRemainingHealth = monster.getHealth();
    }

    public String attack() {
        String text = "";
        if (character.getAttackSpeed() >= monster.getAttackSpeed()) {
            text += "You attacked " + monster.getName() + " and dealt " + character.getAttack() + " damage to it!\n";
            monsterRemainingHealth -= character.getAttack();
            if (monsterRemainingHealth <= 0) {
                return text;
            }
            text += monster.getName() + " attacked you and dealt " + monster.getAttack() + " damage to you!";
            characterRemainingHealth -= monster.getAttack();
        } else {
            text += monster.getName() + " attacked you and dealt " + monster.getAttack() + " damage to you!\n";
            characterRemainingHealth -= monster.getAttack();
            if (characterRemainingHealth <= 0) {
                return text;
            }
            text += "You attacked " + monster.getName() + " and dealt " + character.getAttack() + " damage to it!";
            monsterRemainingHealth -= character.getAttack();
        }
        return text;
    }

    public void openInventory() {
        //character.getInventory().
    }

    public boolean battleStatus() {
        return characterRemainingHealth > 0 && monsterRemainingHealth > 0;
    }

    public void printBattleDetails() {
        System.out.println("\n");
        System.out.println(character.getName() + ": Level: " + character.getLevel() + ", Health: " + characterRemainingHealth + "/" + character.getHealth());
        System.out.println(monster.getName() + ": Level: " + monster.getLevel() + ", Health: " + monsterRemainingHealth + "/" + monster.getHealth());
    }

    public String died() {
        String text = "";
        if (characterRemainingHealth <= 0) {
            text = "You";
        } else if(monsterRemainingHealth <= 0) {
            text = monster.getName();
        }
        return text;
    }
}