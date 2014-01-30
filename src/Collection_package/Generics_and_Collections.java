package Collection_package;



 import java.util.*; 

public class Generics_and_Collections {
	
		public static void main ( String [] args) {
			ArrayList<String> stuff = new ArrayList<String>();
			stuff.add("Denver");
			stuff.add("Boulder");
			stuff.add("Vail");
			stuff.add("Aspen");
			stuff.add("Telluride");
			System.out.println("unsorted" + stuff);
			Collections.sort(stuff);
			System.out.println("sorted" + stuff);
			
			
			
			String [] sa = {"one", "two", "three", "four"};
			
			List sList = Arrays.asList(sa);
			
			System.out.println("size " + sList.size());
			
			System.out.println("idx2 " + sList.get(2));
			
			sList.set(3, "six");
			
			sa[1] = "five";
			
			for ( String s: sa)
					System.out.println(s + " ");
			
			System.out.println("\ns1[1] " + sList.get(1) );
		}
			
}
