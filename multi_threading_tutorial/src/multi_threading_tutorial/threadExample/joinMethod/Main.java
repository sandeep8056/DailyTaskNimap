package multi_threading_tutorial.threadExample.joinMethod;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
		
		JoinMyThread.mt=Thread.currentThread();
		
		JoinMyThread t = new JoinMyThread();
		
		t.start();
		t.join();
		
		for(int i =0;i<10;i++) {
			System.out.println("RAMA "+i);
			Thread.sleep(1000);
		}
		
	}
}
