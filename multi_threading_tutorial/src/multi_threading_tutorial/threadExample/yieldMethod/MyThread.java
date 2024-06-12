package multi_threading_tutorial.threadExample.yieldMethod;

public class MyThread  extends Thread
{

	@Override
	public  void run() {
		
		for(int i =1;i<= 10;i++) {
			System.out.println("hii");
			Thread.yield();
			System.out.println("child thread"+i);
			
		}
	}
	
}
