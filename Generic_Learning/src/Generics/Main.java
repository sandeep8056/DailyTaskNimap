package Generics;

public class Main {
	
	 public static void main(String[] args) {
	        Box<Integer> boxCount = new Box<>();
	        boxCount.set(10);
	        System.out.println("Integer Value: " + boxCount.get());

	        Box<String> stringName = new Box<>();
	        stringName.set("Hi I am box");
	        System.out.println("String Value: " + stringName.get());
	        
	        
	        
	        //generic method
	        Integer[] intArray = {1, 2, 3, 4, 5};
	        String[] stringArray = {"Sandeep", "Nilesh","Mahesh"};

	        System.out.println("Integer Array:");
	        GenericMethodExample.printArray(intArray);

	        System.out.println("String Array:");
	        GenericMethodExample.printArray(stringArray);
	    }
}
