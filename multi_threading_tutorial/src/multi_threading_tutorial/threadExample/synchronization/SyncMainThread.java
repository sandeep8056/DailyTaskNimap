package multi_threading_tutorial.threadExample.synchronization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SyncMainThread {

	public static void main(String[] args) {
		
//		Display dis = new Display();
//		
//		
//		MyThreadSync t1 =new MyThreadSync("Sandy", dis);
//
//		MyThreadSync t2 =new MyThreadSync("Mandy", dis);
//
//		MyThreadSync t3 =new MyThreadSync("Paddy", dis);
//		
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
		Map<Integer,Integer> m = new HashMap<>();
		
		Integer p= m.put(1, 1);
		System.out.println(p);
		
		
		Integer p1= m.put(2, 2);
		Integer pe = m.put(2, 2);
		System.out.println("pe   "+pe);
		System.out.println(p1);
		
		
		m.put(1, 1);
		
//		List<Integer> a = new ArrayList<>();
//		boolean add = a.add(2);
//		a.add(0, 5);
			
	}
}
