package multi_threading_tutorial.threadExample.yieldMethod;

public class ThreadYieldDemo {
	
	
	public static void main(String[] args) {
		
		
		MyThread t = new MyThread();
		
		t.start();
		
		
		for(int i =1;i<10;i++) {
			Thread.yield();
			System.out.println("main thread"+i);
			
		}
	}

}
