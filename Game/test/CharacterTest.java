package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import character.Character;
import equipment.Weapon;
import equipment.Armor;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    Character character;

    @BeforeEach
    void Create_Character_Object() {
        character = new Character();
    }

    @Test
    void Check_If_Weapon_Is_Equipped() {
        character.equipWeapon(Weapon.WOODENSWORD);
        assertEquals(Weapon.WOODENSWORD, character.getEquipmentTab().getWeapon());
    }

    @Test
    void Check_If_Armor_Is_Equipped() {
        character.equipArmor(Armor.WHITETSHIRT);
        assertEquals(Armor.WHITETSHIRT, character.getEquipmentTab().getArmor());
    }

    @Test
    void Check_If_Attack_Is_Updated_Correctly() {
        character.equipWeapon(Weapon.WOODENSWORD);
        assertEquals(Weapon.WOODENSWORD.getAttack(), character.getAttack());
    }

    @Test
    void Check_If_Attack_Speed_Is_Updated_Correctly() {
        character.equipWeapon(Weapon.WOODENSWORD);
        assertEquals(Weapon.WOODENSWORD.getAttackSpeed(), character.getAttackSpeed());
    }

    @Test
    void Check_If_Defense_Is_Updated_Correctly() {
        character.equipArmor(Armor.WHITETSHIRT);
        assertEquals(Armor.WHITETSHIRT.getDefense(), character.getDefense());
    }
}