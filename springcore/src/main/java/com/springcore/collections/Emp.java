package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private int empId;
	private String empName;
	private List<String> mobileNo;
	private Set<String> address;
	private Map<String,String> course;
	private Properties props;
	
	
	
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Emp() {
		
	}
	
	public Emp(int empId,String empName,List<String> mobileNo, Set<String> address,Map<String,String> course ) {
		this.empId = empId;
		this.empName=empName;
		this.mobileNo=mobileNo;
		this.address= address;
		this.course=course;
	}
	
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(int empId) {
		this.empId= empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(List<String> mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", course=" + course + "]";
	}
	
	
	
}
