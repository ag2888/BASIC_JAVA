package InnerClasses;

interface Cookable {
	public void cook();
}

public class Food {


	// Plain-Old Anonymous Inner Classes, Flavor Two
	/*
	 * the line below it's not instantiating a Cookable object, it's creating an instance of a new, anonymous, implementor 
	 * of Cookable 
	 */
	private Cookable c = new Cookable() {
		
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
		
		
	};
	
	private String cookAss = "ankit";
	
	
	public void cook() {
		c.cook(); 
	}
	
	public static void main (String [] args) {
		Food d = new Food();
		d.c.cook(); 
		
		System.out.println(d.cookAss);
	}


}
