package combat;

import item.Potion;
import monster.Monster;
import character.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Xian Yao Ng
 */
public class Battle {
    private final Character character;
    private final Monster monster;
    private int characterRemainingHealth;
    private int monsterRemainingHealth;

    public int getMonsterRemainingHealth() {
        return monsterRemainingHealth;
    }

    public void setMonsterRemainingHealth(int monsterRemainingHealth) {
        this.monsterRemainingHealth = monsterRemainingHealth;
    }

    public int getCharacterRemainingHealth() {
        return characterRemainingHealth;
    }

    public void setCharacterRemainingHealth(int characterRemainingHealth) {
        this.characterRemainingHealth = characterRemainingHealth;
    }

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

    public String monsterAttack() {
        String text = "";
        text += monster.getName() + " attacked you and dealt " + monster.getAttack() + " damage to you!\n";
        characterRemainingHealth -= monster.getAttack();
        return text;
    }

    public void showPotion() {
        character.getInventory().showPotion();
    }

    public String usePotion(int i) {
        i--;
        Set<Potion> potion = character.getInventory().getPotionMap().keySet();
        List<Potion> potionList = new ArrayList<>(potion);
        character.getInventory().getPotionMap().put(potionList.get(i), character.getInventory().getPotionMap().get(potionList.get(i)) - 1);
        characterRemainingHealth += potionList.get(i).getAmount();
        if (characterRemainingHealth > character.getHealth()) {
            characterRemainingHealth = character.getHealth();
        }

        return "You used " + potionList.get(i).getName() + "!\n";
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