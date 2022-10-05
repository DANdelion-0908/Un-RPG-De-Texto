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
	
	// A constructor that takes in the parameters and sets them to the variables.
	public Character(String Name, int Hp, int Attack, String Victory, String Start, String Defeat){
		setName(Name);
		setVictory(victory);
		setDefeat(defeat);
		setStart(start);
		setAttack(attack);
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
