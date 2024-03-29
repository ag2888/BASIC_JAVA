package thread_sourcemantra;

public class NewThread implements Runnable {
	
	Thread t;
	
	NewThread() {
		
		// Create a new second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread:" + t);
		t.setPriority(10);
		t.start();
	
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// Let the thread sleep for a while
				//Thread.sleep(500);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		
		System.out.println("Exiting child thread");
	}
	
}
