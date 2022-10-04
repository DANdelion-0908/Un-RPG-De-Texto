/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Warrior extends Stats {
	
	public static String name;
	private String victory;
	private String start;
	private String defeat;
	
	public String[] wInventory = {"Potion", "Potion", "Potion", "Protein", "Esteroids", "Insta Coffee"};
	
	public Warrior(String Name, int Hp, int Attack, int Defense, int Speed, String Victory, String Start, String Defeat){
		super(500, 60, 70, 30);
		setName(name);
		setVictory(victory);
		setDefeat(defeat);
		setStart(start);
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
