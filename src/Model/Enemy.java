/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public abstract class Enemy  {
	
	private String name;
	private String victory;
	private String start;
	private String defeat;
	protected double hp;
	protected double attack;
	protected boolean boss;
	
	
	// A constructor that takes in the parameters and sets them to the variables.
	public Enemy(String Name, int Hp, int Attack, String Victory, String Start, String Defeat, boolean boss){
		setName(Name);
		setVictory(victory);
		setDefeat(defeat);
		setStart(start);
		setAttack(attack);
		setHp(hp);
		setBoss (boss);
		
	}
	
	public boolean isBoss() {
		return boss;
	}

	public void setBoss(boolean boss) {
		this.boss = boss;
	}

	public double getHp() {
		return hp;
	}
	public void setHp(double d) {
		this.hp = d;
	}
	public double getAttack() {
		return attack;
	}
	public void setAttack(double d) {
		this.attack = d;
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
