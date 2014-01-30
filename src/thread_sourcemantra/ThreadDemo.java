package thread_sourcemantra;

public class ThreadDemo {
	public static void main (String [] args) {
		Thread.currentThread().setPriority(1);
		new NewThread(); // create a new Thread. 
		
		try {
		
			for(int i = 5; i > 0; i--) {
				System.out.println("Main thread: " + i);
				//Thread.sleep(1000);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("Main Thread interrupted");
		}
		
		
	}
	
}
