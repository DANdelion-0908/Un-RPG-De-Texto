/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Bush extends Character{
	
	private String name;
	private boolean boss;
	
	// Calling the constructor of the superclass and then calling the setters of the class.
	public Bush() {
		super("Arbusto Malvado", 500, 30, "*Sonidos de arbusto*", "*Se estremece*", "*Han caído sus hojas*");
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
