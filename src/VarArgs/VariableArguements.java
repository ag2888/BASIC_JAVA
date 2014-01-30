package VarArgs;

public class VariableArguements {
	static void doStuff(int ... x) {
		
		int [] xx = x; 
		for ( int y : x) {
			System.out.println(y);
		}
	}
	
	public static void main ( String [] args) {
		doStuff(4, 3, 2 , 1);
		
		
	}
}
