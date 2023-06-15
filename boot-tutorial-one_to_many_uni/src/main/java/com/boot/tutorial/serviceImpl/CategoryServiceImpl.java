package com.boot.tutorial.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.tutorial.dto.CategoryDto;
import com.boot.tutorial.dto.ProductDto;
import com.boot.tutorial.entity.Category;
import com.boot.tutorial.entity.Product;
import com.boot.tutorial.repository.CategoryRepository;
import com.boot.tutorial.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<CategoryDto> getAllCategory() {

		List<Category> category = categoryRepository.findAll();

		return null;
	}

	public CategoryDto getByCategory(String category) {
		try {
			return convertEntitytoDto(categoryRepository.getByCategoryName(category));
		} catch (Exception e) {
			throw e;
		}
	}

	public CategoryDto convertEntitytoDto(Category category) {

		CategoryDto categoryDto = new CategoryDto();

		categoryDto.setCategoryName(category.getName());

		// list of productdto
		List<ProductDto> productDtos = new ArrayList<>();

		productDtos = category.getProducts().stream().map(product -> {
			ProductDto productDto = new ProductDto();
			productDto.setProductId(product.getId());
			productDto.setProductName(product.getName());
			productDto.setProductQuantity(product.getQuantity());
			return productDto;
		}).collect(Collectors.toList());
		categoryDto.setProducts(productDtos);
		return categoryDto;
	}

	public Category convertDtoToEntity(CategoryDto categoryDto) {

		Category category = new Category();
		category.setName(categoryDto.getCategoryName());

		List<Product> product = categoryDto.getProducts().stream().map(productDto -> {
			Product newProduct = new Product();
			newProduct.setId(productDto.getProductId());
			newProduct.setName(productDto.getProductName());
			newProduct.setQuantity(productDto.getProductQuantity());
			return newProduct;
		}).collect(Collectors.toList());

		category.setProducts(product);
		return category;

	}

	public Product convertProductDtoToEntity(ProductDto productDto) {
		Product product = new Product();
		product.setId(productDto.getProductId());
		product.setName(productDto.getProductName());
		product.setQuantity(productDto.getProductQuantity());
		return product;
	}

	@Override
	public CategoryDto addCategory(CategoryDto categoryDto) {

		try {
			Category category = convertDtoToEntity(categoryDto);
			category = categoryRepository.save(category);

			return convertEntitytoDto(category);
		} catch (Exception e) {
			throw e;
		}
	}

	public String addProductToExistingCategory(String category, ProductDto productDto) throws Exception {

		try {
			if (category == null) {
				throw new Exception("category not exists");
			} else {

				Category updatedCategory = categoryRepository.findAll().stream()
						.filter(cat -> cat.getName().contains(category)).map(p -> {

							p.getProducts().add(convertProductDtoToEntity(productDto));
							return p;
						}).findAny().get();
				categoryRepository.save(updatedCategory);

				return "added product to existing category";
			}
		} catch (Exception e) {
			throw e;
		}

	}
	
	public String deleteCategoryByName(String categoryName) {
		try {
		categoryRepository.deleteCategoryByName(categoryName);
		return "category deleted successfully";
		}catch (Exception e) {
			throw e;
		}
		
		
	}
	
	
	
	
	 
	
	
	
	

}
