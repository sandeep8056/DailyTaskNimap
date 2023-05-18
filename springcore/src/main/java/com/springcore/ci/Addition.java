package com.springcore.ci;

public class Addition {

	/*  Ambiguity problem and its solution with Constructor injection */
	
	
	private int a ;
	private int b;
	
	Addition(int a , int b){
		System.out.println("Constructor : int  int");
		this.a = a;
		this.b = b;
	}
	
	Addition(double a , double b){
		System.out.println("Constructor : double   double");
		this.a = (int)a;
		this.b = (int)b;
	
	}
	
	Addition(String a, String b){
		System.out.println("Constructor : String String");
		this.a=Integer.parseInt(a);
		this.b =Integer.parseInt(b);
	}
	
	
	public void doSum() {
		System.out.println("a "+this.a);
		System.out.println("b "+this.b);
		System.out.println("addition a and b"+(this.a+this.b));
	}
	
}
