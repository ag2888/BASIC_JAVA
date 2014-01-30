package Collection_package;
import java.util.*;



public class ArrayListPostJDK15Test {

		public static void main ( String [] args) {
			
			
			List<String> lst = new ArrayList<String>(); // Inform the compiler about the type 
			
			lst.add("alpha");	// compiler checks if argument's type is String
			lst.add("beta");
			lst.add("charles");
			
			
			lst.add("charlie");
			
			System.out.println(lst); // [alpha, beta, charlie] 
			
			Iterator<String> iter = lst.iterator(); // Iterator of String
			
			while(iter.hasNext()) {
				String str = iter.next(); // compiler inserts downcast operator 
				System.out.println(str);
			}
			
			
			//  lst.add(new Integer(1234)); // Error: compiler can detect wrong type
		  //	Integer intObj = lst.get(0); // Error: compiler can detect wrong type 
			
			
			// enhanced for-loop (JDK 1.5) 
			for (String str: lst)
			{
				System.out.println(str);
			}
			
			
			
		}
	
}
