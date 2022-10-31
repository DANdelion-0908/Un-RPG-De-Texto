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
	protected double hp;
	protected int attack;
	protected int potion;
	protected int coffee;
	protected int bomb;
	
	// A constructor that takes in the parameters and sets them to the variables.
	public Character(String Name, int Hp, int Attack, String Victory, String Start, String Defeat, int potion, int coffee, int bomb){
		setName(Name);
		setVictory(victory);
		setDefeat(defeat);
		setStart(start);
		setAttack(attack);
		setHp(hp);
		setPotion (potion);
		setCoffee (coffee);
		setBomb (bomb);
		
	}
	
	public double getHp() {
		return hp;
	}
	public void setHp(double d) {
		this.hp = d;
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

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	public int getBomb() {
		return bomb;
	}

	public void setBomb(int bomb) {
		this.bomb = bomb;
	}
	
	
		
}
