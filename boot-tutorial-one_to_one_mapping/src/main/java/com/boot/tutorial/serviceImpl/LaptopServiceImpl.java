package com.boot.tutorial.serviceImpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.boot.tutorial.Service.LaptopService;
import com.boot.tutorial.dto.ILaptopDto;
import com.boot.tutorial.modal.Laptop;
import com.boot.tutorial.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{

	
	@Autowired
	private LaptopRepository laptopRepository;

	@Override
	public List<ILaptopDto> getAllLaptop() {

		
		
		List<ILaptopDto> laptopList = laptopRepository.findByOrderByLaptopId(ILaptopDto.class);
		return laptopList;
	}

	@Override
	public Laptop addLaptop(Laptop laptop) {
		try {
			Laptop newLaptop = new Laptop();
			newLaptop.setModalNumber(laptop.getModalNumber());
			newLaptop.setBrand(laptop.getBrand());
			newLaptop.setStudent(laptop.getStudent());

			return laptopRepository.save(newLaptop);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public String updateLaptop(Integer id, Laptop updatestudent) {
		try {
			Laptop previousLaptop = null;
			Optional<Laptop> laptop = laptopRepository.findById(id);

			if (!Objects.isNull(laptop)) {
				previousLaptop = laptop.get();
			}

			previousLaptop.setModalNumber(updatestudent.getModalNumber());
			previousLaptop.setBrand(updatestudent.getBrand());
			previousLaptop.setStudent(updatestudent.getStudent());

			laptopRepository.save(previousLaptop);
			return "laptop succesfully  updated";
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public String deleteLaptop(Integer id) {
		try {
			laptopRepository.deleteById(id);

			return "laptop deleted successfully id : " + id;
		} catch (Exception e) {
			throw e;
		}
	}
}
