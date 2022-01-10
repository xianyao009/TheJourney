/**
 * Represents an equipment tab (indicate what equipments are the character currently wearing)
 * @author Xian Yao Ng
 */
public class EquipmentTab {
	private Weapon weapon;
	private Armor armor;

	/**
	 * Creates an EquipmentTab object
	 * @param weapon The weapon character currently using
	 * @param armor The armor character currently wearing
	 */
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

	/**
	 * Print out the info of equipment tab
	 */
	public void printInfo() {
		System.out.println("Equipment tab");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Weapon equipped: " + this.weapon.getName());
		System.out.println("Armor equipped: " + this.armor.getName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}