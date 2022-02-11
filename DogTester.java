import java.util.ArrayList;

public class DogTester
{
	
	public static void main(String[] args)
	{
		ArrayList<Dog> dogArr = new ArrayList<>();
		Dog d1 = new Dog("Billy", 2005);
		Dog d2 = new Dog("Charlie", 2001);
		Poodle p1 = new Poodle("Sally", 2004);
		Poodle p2 = new Poodle("Dylan", 2008);
		Bassett b1 = new Bassett("Phillip", 2009);
		Bassett b2 = new Bassett("Lauren", 2006);
		p1.eats("Bacon");
		dogArr.add(p1);
		dogArr.add(p2);
		dogArr.add(d1);
		dogArr.add(d2);
		dogArr.add(b1);
		dogArr.add(b2);
		System.out.print(dogArr);
		
	}
}

