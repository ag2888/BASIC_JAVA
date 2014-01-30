package Collection_package;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	
		public static void main (String [] args) {
			
			// create an ArrayList object
			ArrayList arrayList = new ArrayList();
			arrayList.add("1");
			arrayList.add("2");
			arrayList.add("3");
			arrayList.add("4");
			arrayList.add("5");
			
			/*
			 * To get a sub list of Java ArrayList use List subList(int startIndex, int EndIndex) method. 
			 * This method returns an object of type list containing elements from startIndex to endIndex 
			 * 
			 */
			
			List lst = arrayList.subList(1, 3);
			
			// display the elements of sub list
			for (int i = 0; i < lst.size(); i++)
			{
				System.out.println(lst.get(i));
			}
			
			/*
			 * Sub list returned by subList method is backed by original ArrayList. So any changes made to sub list
			 * will also be REFLECTED in the original ArrayList 
			 */
			
			String o = "1";
			// REMOVE ONE ELEMENT FROM sub list
			Object obj =lst.remove(0); 
			
			// print Original ArrayList
			System.out.println("After removing" + obj + " from sub list, original ArrayList contains:");
			
			for (int i = 0; i < arrayList.size(); i++)
				System.out.println(arrayList.get(i));
			
			
			
			
		}
	
	
	
	
}
