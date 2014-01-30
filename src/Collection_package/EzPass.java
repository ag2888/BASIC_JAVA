package Collection_package;

import java.util.Date;
import java.util.Random; 
import java.util.*;
public class EzPass {
	
	private int pin;
	
	private Date expr; 
	
	public int getPin() {
		return pin; 
	}
	
	public Date expr() {
		return expr; 
	}
	
	public EzPass(int pin)
	{
		expr = new Date();
		this.pin = pin; 
	}
	
	
	public boolean equals(Object o) {
		if((o instanceof EzPass) && (((EzPass)o).getPin() == this.pin)) {
			return true; 
		}
		else 
			return false; 
	}
	
	public int hashCode() {
		Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(100);
		return pin;
		
	}
	
	
	
	public static void main ( String [] args) {
		EzPass a = new EzPass(2);
		EzPass b = new EzPass(2);
		HashSet<EzPass> a1 = new HashSet<EzPass>();
		a1.add(a);
		a1.add(b);
		
		if(a1.contains(a)) {
			System.out.println("Contained in HashSet");
		}
		
		
		if ( a.equals(b)) {
			System.out.println("true");
			
		}
	}
	
	
	
}
