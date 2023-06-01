package com.boot.tutorial.Service;

import java.util.List;

import com.boot.tutorial.dto.ILaptopDto;
import com.boot.tutorial.modal.Laptop;

public interface LaptopService {
	

	public List<ILaptopDto> getAllLaptop();
	
	public Laptop addLaptop(Laptop laptop);
	
	public String  updateLaptop(Integer id, Laptop laptop);
	
	public String deleteLaptop(Integer id);


}
