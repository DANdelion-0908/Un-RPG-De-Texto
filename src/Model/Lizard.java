/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Lizard extends Stats{
	
	private String name;
	private boolean boss;
	
	public Lizard(String Name, boolean Boss) {
		super(600, 40, 40, 40);
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
