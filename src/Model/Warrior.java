/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Warrior extends Character {
	
	private String name;
	private String victory;
	private String start;
	private String defeat;
	
	// Creating an array of strings.
	public String[] wInventory = {"Potion", "Potion", "Potion", "Protein", "Esteroids", "Insta Coffee"};
	
	// Calling the constructor of the superclass.
	public Warrior(){
		super("Máximo", 500, 60, "¡Tu vida acaba aquí!", "No hay nada como una batalla emocionante.", "... Tal parece que... no he sido lo suficientemente fuerte...");
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