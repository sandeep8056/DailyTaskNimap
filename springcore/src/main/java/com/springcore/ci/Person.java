package com.springcore.ci;

import java.util.List;

public class Person {
	
	
	private String name;
	private Certi cer;
	private List<String> list;
	
	public Person(String name, Certi cer,List<String> list) {
		super();
		System.out.println("done in constructor");
		this.name = name;
		this.cer = cer;
		this.list = list;
	}

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certi getCer() {
		return cer;
	}

	public void setCer(Certi cer) {
		this.cer = cer;
	}
	
	
	
	

	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}
	

}
