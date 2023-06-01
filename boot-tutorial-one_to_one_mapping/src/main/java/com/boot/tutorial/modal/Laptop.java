package com.boot.tutorial.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer laptopId;
	
	private String modalNumber;
	
	private String brand;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "student_id")
	private Student student;
	
	
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(Integer laptopId, String modalNumber, String brand) {
		super();
		this.laptopId = laptopId;
		this.modalNumber = modalNumber;
		this.brand = brand;
	}

	public Integer getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}

	public String getModalNumber() {
		return modalNumber;
	}

	public void setModalNumber(String modalNumber) {
		this.modalNumber = modalNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	
}
