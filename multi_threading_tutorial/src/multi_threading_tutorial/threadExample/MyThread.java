package multi_threading_tutorial.threadExample;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//job of thread
		for(int i =0;i<10;i++) {
			System.out.println("child thread "+ i);
		}
		
	}
	
	
	public void run (int k){
		System.out.println(k);
	}

}
