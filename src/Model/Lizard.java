/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Lizard extends Character{
	
	private String name;
	private boolean boss;
	
	// Calling the constructor of the superclass and then calling the setters of the class.
	public Lizard() {
		super("Lagartija", 600, 40, "*Saca su lengua con furia*", "*Comienza a calentar*", "*Cae al suelo*");
		setName(name);
		setBoss(boss);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBoss() {
		return boss;
	}

	public void setBoss(boolean boss) {
		this.boss = boss;
	}
	
	

}
