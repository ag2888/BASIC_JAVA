package Collection_package;

import java.util.*;

public class SearchObjArray {
	public static void main (String [] args) {
		
		String [] sa = {"one", "two" , "three", "four"};
		
		Arrays.sort(sa);
		
		for (String s: sa)
			System.out.print(s + " ");
		
		System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
		
		System.out.println("now reverse sort");
		
		ResortComparator rs = new ResortComparator();
				
		Arrays.sort(sa, rs);
		
		
		// The reason we get an incorrect index is that we have not passed the Comparator into the binary search 
		for(String s : sa)
			System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
		
		System.out.println("one = " + Arrays.binarySearch(sa, "one",rs));
		
	}
	
	static class ResortComparator implements Comparator<String> {
		
			public int compare (String a, String b) {
				return b.compareTo(a);
			}
	}
	
	
	
}

