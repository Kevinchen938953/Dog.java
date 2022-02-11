public class Dog
{
	private String name;
	private int year;
	private String eat;
	
	public Dog(String name, int birth)
	{
		this.name = name; 
		year = birth;
	}
	public void eats(String food)
	{
		System.out.print("The dog eats" + food);
	}
	public void sleep(String sleep)
	{
		System.out.println("The dog sleeps" + sleep);
	}
	public String toString()
	{
		return("\n Dog's birth year and name is " + year + this.name);
	}
}
	
  
public class Poodle extends Dog
{
	private String eats;
	private String bark;
	public Poodle(String name, int birth)
	{
		super(name,birth);
		
	}
	public String toString()
	{
		return("The dog's name is" + " " + super.toString());
		
	}
}

public class Bassett extends Dog
{
	private String eats;
	public Bassett(String name, int birthyear)
	{
		super(name,birthyear);
	
	}
	public String toString()
	{
		return("The dog's name and age are " + super.toString());
	}
}
		
		
		
