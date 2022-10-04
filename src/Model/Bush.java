/**
 * 
 */
package Model;

/**
 * @author Dan
 *
 */
public class Bush extends Stats{
	
	private String name;
	private boolean boss;
	
	public Bush(String Name, boolean Boss) {
		super(400, 50, 20, 60);
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
