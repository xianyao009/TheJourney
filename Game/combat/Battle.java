package combat;

import item.Potion;
import monster.Monster;
import character.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
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

    /**
     * Creates a Battle object
     * @param character The character who participates in the battle
     * @param monster The monster who participates in the battle
     */
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
        String text;
        Map<Potion, Integer> potionMap = character.getInventory().getPotionMap();
        Set<Potion> potion = character.getInventory().getPotionMap().keySet();
        List<Potion> potionList = new ArrayList<>(potion);
        try {
            text = "You used " + potionList.get(i).getName() + " and your health was restored by ";
            if (potionMap.get(potionList.get(i)) > 1) {
                potionMap.put(potionList.get(i), potionMap.get(potionList.get(i)) - 1);
            } else if (potionMap.get(potionList.get(i)) == 1) {
                potionMap.remove(potionList.get(i));
            }

            int amountRestored;
            if (potionList.get(i).getAmount() + characterRemainingHealth > character.getHealth()) {
                amountRestored = character.getHealth() - characterRemainingHealth;
            } else {
                amountRestored = potionList.get(i).getAmount();
            }
            text += amountRestored;
            characterRemainingHealth += amountRestored;
        } catch (IndexOutOfBoundsException e) {
            text = "Please enter only the number correspondent to the potion";
        }

        return text + "!\n";
    }

    /**
     * @return true if both character and monster are still alive. Otherwise, false.
     */
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