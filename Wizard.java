
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable
{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() 
	{
	
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name, int health, int key, boolean locked) 
	{
	
	setName("");
		
	setHealth(0);
	
	setKey(0);
	
	this.locked = false;
	
	this.name = name;
	
	this.health = health;
	
	this.key = key;
	
	this.locked = locked;

	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) 
	{
		if(isLocked() == true)
		{
		System.out.print("The chest was locked, the wizard's health is now ");
		System.out.println(this.health - power);
		}
		else
		System.out.println("The chest was unlocked so the wizard didn't take damage.");
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) 
	{	
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() 
	{
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() 
	{
		return key;
	}//end getKey

	@Override
	public String toString() 
	{
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", "
		+ "locked=" + locked + "]";
	}//end toString
	
	public void setKey(int key)
	{
		if(key>0 && this.key ==0)
		{
			this.key = key;
		}
	}
	
	public void lock(int key) 
	{
		if(this.key == key)
		{
			this.locked = true;
		}
	}
	
	public void unlock(int key)
	{
		if(this.key == key) 
		{
			this.locked = false;
		}
	}
	
	public boolean isLocked()
	{
		return this.locked;
	}
	
}//end class

