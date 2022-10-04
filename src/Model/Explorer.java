/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Explorer extends Stats {
	
	private String name;
	private String victory;
	private String start;
	private String defeat;
	
	public Explorer(String Name, int Hp, int Attack, int Defense, int Speed, String Victory, String Start, String Defeat){
		super(200, 30, 30, 100);
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
