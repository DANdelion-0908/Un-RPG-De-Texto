/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public abstract class Character  {
	
	private String name;
	private String victory;
	private String start;
	private String defeat;
	protected int hp;
	protected int attack;
	protected int defense;
	protected int speed;
	
public String[] wInventory = {"Potion", "Potion", "Potion", "Protein", "Esteroids", "Insta Coffee"};
	
	public Character(String Name, int Hp, int Attack, int Defense, int Speed, String Victory, String Start, String Defeat){
		setName(Name);
		setVictory(victory);
		setDefeat(defeat);
		setStart(start);
		setAttack(attack);
		setDefense(defense);
		setSpeed(speed);
		setHp(hp);
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVictory() {
		return victory;
	}

	public void setVictory(String victory) {
		this.victory = victory;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDefeat() {
		return defeat;
	}

	public void setDefeat(String defeat) {
		this.defeat = defeat;
	}
		
}
