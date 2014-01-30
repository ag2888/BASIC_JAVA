package thread_sourcemantra;

	public class Wombat implements Runnable {
		private int i = 0; 
		@Override
		public void run() {
			
			//if(i % 5 != 0) {i++;}
			
			System.out.println(Thread.currentThread().getName() + "entered the run block");
			
			synchronized(Wombat.class) {
				
				System.out.println(Thread.currentThread().getName() + "entered the synchronized block");
				
				
			for (int x = 0; x < 5; x++, ++i) {
				
				
				if ( x > 1) Thread.yield(); 
			}
			
			}
			
			System.out.println(Thread.currentThread().getName() + " i value is " + i + " ");
			
			
		}
		
		public static void main ( String [] args) {
			
			Wombat n = new Wombat();
			for(int x =100; x > 0; --x) {
				new Thread(n).start(); 
			}
			
		}
		
		
		
		
	}
