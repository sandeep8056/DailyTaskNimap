package multi_threading_tutorial.threadExample.runableInterface;
//defination of thread 
public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("this thread is going to make it "+Thread.currentThread().getName());
		
		for(int i =0;i<5;i++) {
			System.out.println(i);
		}
	}
	
	
	
	}
