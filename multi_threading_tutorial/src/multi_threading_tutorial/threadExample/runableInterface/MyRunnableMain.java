package multi_threading_tutorial.threadExample.runableInterface;

public class MyRunnableMain {
	
	public static void main(String[] args) {
		
		
		System.out.println("this lineis executed by main :  "+Thread.currentThread().getName());
		
		System.out.println("thread priority"+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(9);
		RunnableThread runable  = new RunnableThread();
		
		System.out.println("After setting thrad "+Thread.currentThread().getPriority());
		
		Thread t = new Thread(runable);
		
		t.start();
System.out.println(	"child thread"+	t.getPriority());
		
		System.out.println("runnable using interface callled");
		
		System.out.println(t.currentThread().getName());
		
	for(int i =0;i<5;i++) {
		System.out.println(i+"main");
	}

	Thread.currentThread().setName("sandep thread");
	
	System.out.println(Thread.currentThread().getName());
	
	System.out.println(" low " +Thread.MIN_PRIORITY);
	
	System.out.println(Thread.NORM_PRIORITY);
	
	System.out.println(Thread.MAX_PRIORITY);
	
	}

}
