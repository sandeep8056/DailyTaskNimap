 	package com.boot.tutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.tutorial.dto.ILaptopDto;
import com.boot.tutorial.modal.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

	List<ILaptopDto> findByOrderByLaptopId(Class<ILaptopDto> class1);

	//List<ILaptopDto> findAll(Class<ILaptopDto> class1);

//	List<ILaptopDto> findAll(Class<ILaptopDto> class1);

}
