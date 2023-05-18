package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> friends;
	private Map<String,Integer> coursefee;
	
	
	
	
	public Map<String, Integer> getCoursefee() {
		return coursefee;
	}

	public void setCoursefee(Map<String, Integer> coursefee) {
		this.coursefee = coursefee;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	
	
	

}
