package com.boot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boot.tutorial.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	@Query("from Category where name = :name ")
	public  Category getByCategoryName(@Param("name") String category);
	
	@Query("from Category where name = :name ")
	public String deleteCategoryByName(@Param("name")String categoryName);

}
