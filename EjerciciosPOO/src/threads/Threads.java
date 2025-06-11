package threads;

public class Threads extends Thread {
		private int nro = 0;
		
		Threads (int n) { this.nro = n;}
		
		public void run() 
		{
			try 
			{
				System.out.println(nro);
				Thread.sleep((long)(1000*Math.random()));
			} catch (InterruptedException e) { return; }
			
		}
		
		public static void main(String[] args) 
		{
			for (int i=0; i<10; i++) 
			{
				new Threads(i).start();
			}
		}
}
