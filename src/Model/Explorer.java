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
	
	public Explorer(String Name, String Victory, String Start, String Defeat){
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
