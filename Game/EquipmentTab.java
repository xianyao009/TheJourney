public class EquipmentTab{
	Character character;
	Weapon weapon;
	Armor armor;
	
	public EquipmentTab(Character character){
		this.character = character;
	}
	
	public void equipWeapon(Weapon weapon){
		this.weapon = weapon;
		character.attack = weapon.attack;
		character.attackSpeed = weapon.attackSpeed;
	}
	
	public void equipArmor(Armor armor){
		this.armor = armor;
		character.defense = armor.defense;
	}
	
}