
public class Application 
{

	public static void main(String[] args) 
	{
		
		Wizard myWizard = new Wizard("Dave", 100, 88, true);
		
		System.out.println(myWizard);
		
		myWizard.setName("Steve");
		System.out.println("My Wizards name is " +myWizard.getName());
		
		myWizard.setHealth(120);
		System.out.println("Steve has a health pool of " +myWizard.getHealth());
		
		myWizard.setKey(54);
		System.out.println("Steve has key number " +myWizard.getKey());
		
		myWizard.lock(88);
		System.out.println("Is the chest locked? " +myWizard.isLocked());
		
		myWizard.unlock(88);
		System.out.println("Is the chest locked? " +myWizard.isLocked());
		
		System.out.println("Steve's current health is " +myWizard.getHealth());
		
		myWizard.takeDamage(20);
		
		myWizard.lock(88);
		
		myWizard.takeDamage(20);
		
		
		

	}

}
