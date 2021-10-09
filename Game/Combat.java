public class Combat{
	Character character;
	Monster monster;
	
	public Combat(Character character, Monster monster){
		this.character = character;
		this.monster = monster;
	}
	
	public void characterAttack(){
		monster.health -= (character.attack - monster.defense);
		character.combatStatus = true;
	}
	
}