package Collection_package;
import java.util.*;

class Dog {
	public String name; 
	Dog(String n) {
		name = n;
	}
}



public class ItTest {
	
		public static void main ( String [] args) {
			List<Dog> d = new ArrayList<Dog>();
			Dog dog = new Dog("aiko");
			d.add(dog);
			d.add(new Dog("clover"));
			d.add(new Dog("magnolia"));
			Iterator<Dog> i3 = d.iterator();
			while(i3.hasNext()) {
				Dog d2 = i3.next();
				System.out.println(d2.name);
			}
		}
	
}
