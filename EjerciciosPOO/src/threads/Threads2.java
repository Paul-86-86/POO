package threads;

public class Threads2 extends Thread {
	
	static int n = 1;

	public void run() 
	{
		try 
		{
			Thread.sleep((long)(1000*Math.random()));
		} catch (InterruptedException e) { return; }
		for(int i = 0; i<10; i++) 
		{
			System.out.println(n);
			n++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Threads2();
		Thread th2 = new Threads2();
		
		th1.start();
		th2.start();
	}

}
