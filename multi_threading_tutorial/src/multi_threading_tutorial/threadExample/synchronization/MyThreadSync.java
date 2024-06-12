package multi_threading_tutorial.threadExample.synchronization;

public class MyThreadSync  extends Thread{

	private String name;
	
	private Display display;
	
	
	public MyThreadSync(String name ,Display display) {
		this.name = name;
		this.display = display;
	}
	@Override
	public void run() {
	
		display.display(name);
		
	}

	
	
}
