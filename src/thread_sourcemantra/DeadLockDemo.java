package thread_sourcemantra;

class ThreadSafeBankAccount { 
	private double balance;
	private int number;
	
	
	public ThreadSafeBankAccount(int num, double initialBalance)
	{
		balance = initialBalance;
		number  = num; 
	}
	
	public int getNumber() 
	{
		return number;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		synchronized(this)
		{
			
			double prevBalance = balance; 
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			
			balance = prevBalance + amount; 
		}
	}

	public void withdraw(double amount)
	{
		synchronized(this)
		{
			double prevBalance = balance;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			balance = prevBalance + amount; 
			
		}
	}
	
	
}

class LazyTeller extends Thread 
{
	private ThreadSafeBankAccount source, dest; 
	
	public LazyTeller(ThreadSafeBankAccount a, ThreadSafeBankAccount b)
	{
		source = a ;
		dest = b; 
		
	}
	
	
	public void run() 
	{
		transfer(250.00);
	}
	
	public void transfer(double amount)
	{
		
		
		System.out.println("Transferring from " + source.getNumber() + " to " + dest.getNumber()); 
	
		synchronized(source)
		{
			
			//Thread.yield();
		
			
			
			synchronized(dest) {
			
				
				System.out.println("Withdrawing from "+ source.getNumber());
				source.withdraw(amount);
				System.out.println("Depositing into" + dest.getNumber());
				dest.deposit(amount);
			}
			
			
		}
	
}
	
}


public class DeadLockDemo {
	public static void main(String [] args) {
		
	
		
		
		
		
		
		System.out.println("Creating two bank accounts...");
		ThreadSafeBankAccount checking = new ThreadSafeBankAccount(101, 1000.00);
		ThreadSafeBankAccount savings  = new ThreadSafeBankAccount(102, 5000.00);
		
		System.out.println("Creating two teller threads");
		
		Thread teller1 = new LazyTeller(checking, savings);
		Thread teller2 = new LazyTeller(savings, checking);
		teller1.start();
		teller2.start();
		
		
		
		
		
		
		
		
		
	}	
		
	
}
