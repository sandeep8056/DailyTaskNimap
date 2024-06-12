package multi_threading_tutorial.threadExample.synchronization;

import java.util.Iterator;

public class Display {

	public synchronized void   display(String name) {

		for (int i = 0; i < 7; i++) {

			System.out.print("Hei Programmer ! ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name);
		}
	}

}
