public class EquipmentTab {
	private Weapon weapon;
	private Armor armor;

	public EquipmentTab(Weapon weapon, Armor armor) {
		this.weapon = weapon;
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}
}