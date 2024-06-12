package multi_threading_tutorial.threadExample.synchronization;

import java.util.Arrays;

public class printTimes {

	
	public static void main(String[] args) {
		
	    String str ="2[ab]3[cde]4[efgh]";
	    
	   
	    
	    
	    String[] split = str.split("]");
	    
	    for(String s : split) {
	    	
	     
	    for(int i =0;i<s.length();i++) {
	    	
	    	Integer a = Integer.parseInt(Character.toString(s.charAt(i)));
	    while(a != 0) {	
	    	for(int j = 2;j<=s.length()-1;j++) {
	    		System.out.print(s.charAt(j));
	    	}
	    	a--;
	    }
	    	break;
	}
	    
	    
	    }
	    
	    
	
	   
		
	}
}
