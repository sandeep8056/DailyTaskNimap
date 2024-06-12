package multi_threading_tutorial.threadExample;

public class DemonThread {
	
	
	public static void main(String[] args) {
		
		MyThread myThread = new  MyThread();  //initilization of thread
		myThread.start();;  //here child thread is started 
		
		
		//executed my main thread 
		for(int i =0;i<10;i++) {
			System.out.println("main thread"+i);
		}
		
		myThread.run(10);
		
		
	}

}
