package InnerClasses;


interface Foo {
	void foof();
	
}




class Bar {
	void doStuff(Foo f) {
		System.out.println("hello"); 
		f.foof(); 
	}
}



public class MyWonderfulClass {
	public static void main ( String [] args) {
		Bar b = new Bar(); 
		
		b.doStuff( new Foo() {
			public void foof() {
				System.out.println("hllo");
			}
		});
		
		
		
	}
}
