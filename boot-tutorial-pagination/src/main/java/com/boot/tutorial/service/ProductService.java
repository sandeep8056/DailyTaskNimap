package com.boot.tutorial.service;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.boot.tutorial.dto.PageRequestProductDto;
import com.boot.tutorial.dto.SortProductDto;
import com.boot.tutorial.modal.Product;
import com.boot.tutorial.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Page<Product> getAllProductUsingPagination(PageRequestProductDto dto) {

		Pageable pageable = null;
		if (dto != null) {
			pageable = new PageRequestProductDto().getPageAble(dto);
		}
		return productRepository.findAll(pageable);
	}

	public String addProduct(Product product) {
		Product newProduct = new Product();
		newProduct.setName(product.getName());
		newProduct.setPrice(product.getPrice());
		newProduct.setQuantity(product.getQuantity());
		productRepository.save(newProduct);
		return "product added successfully";
	}

	public List<Product> getProductWithoutDto(Integer pageNo, Integer pageSize) {

		Pageable page = PageRequest.of(pageNo, pageSize);
		List<Product> products = productRepository.findAll(page).getContent();
		return products;
	}

	public List<Product> getProductSortByColumn(SortProductDto dto) {

		Pageable pageable = null;
		if (dto != null) {
			pageable = new SortProductDto().getPageable(dto);
		}
		List<Product> products = productRepository.findAll(pageable).getContent();
		return products;
	}

//	public Page<Product> getAllProductUsingPaginationList(SortProductDto dto) {
//		// 1. page listholder
//		List<Product> productlist = productRepository.findAll();
//		PagedListHolder<Product> pagelist = new PagedListHolder<>();
//		pagelist.setPage(dto.getPageNo());
//		pagelist.setPageSize(dto.getPageSize());
//
//		// 2. property comparator using specific attribute
//		List<Product> pageSlice = pagelist.getPageList();
//		boolean asscending = dto.getSort().isAscending();
//		PropertyComparator.sort(pageSlice, new MutableSortDefinition(dto.getSortByColumn(), true, asscending));
//		// 3. PageIMPL
//		Page<Product> products = new PageImpl<>(pageSlice, new SortProductDto().getPageable(dto), productlist.size());
//		return products;
//	}
	
	
	
	//query method pagination
	public Page<Product> getAllStudentUsingPaginationByQuery( SortProductDto dto,String quantity){
		
		Pageable pageable = new SortProductDto().getPageable(dto);
		Page<Product> studentPage =	productRepository.findAllByQuantity(quantity,pageable);
		
		return studentPage;
	
	}
	
	
	
	
}
