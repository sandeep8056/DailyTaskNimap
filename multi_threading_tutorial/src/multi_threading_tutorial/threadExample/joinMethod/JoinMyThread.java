package multi_threading_tutorial.threadExample.joinMethod;

public class JoinMyThread extends Thread {

	static Thread mt;
	
	@Override
	public void run() {
		
		
		for(int i =0;i<10;i++) {
			System.out.println("Sita thread");
		try {
			mt.join();  //here run  child thread wait to complete for main thread
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	}
}
