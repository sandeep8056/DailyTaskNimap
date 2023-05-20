package com.boot.tutorial.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.dto.PageRequestProductDto;
import com.boot.tutorial.dto.SortProductDto;
import com.boot.tutorial.modal.Product;
import com.boot.tutorial.repository.ProductRepository;
import com.boot.tutorial.service.ProductService;

@RestController
public class Controller {

	@Autowired
	private ProductService productService;

	@PostMapping("/products")
	public ResponseEntity<?> GetProductUsingPageSize(@RequestBody PageRequestProductDto dto) {
		return new ResponseEntity<>(productService.getAllProductUsingPagination(dto), HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<?> getProductWithoutUsingDto(@RequestParam("pageNo") Integer pageNo,
			@RequestParam("pageSize") Integer pageSize) {
		return ResponseEntity.status(HttpStatus.OK).body(productService.getProductWithoutDto(pageNo, pageSize));
	}

	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
	}

	@PostMapping("/Product-sort-by-column")
	public ResponseEntity<List<Product>> sortByColumn(@RequestBody SortProductDto dto) {

		List<Product> products = productService.getProductSortByColumn(dto);

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	
//	@PostMapping("/list")
//	public ResponseEntity<?> getProductUsingPaginationList(@RequestBody SortProductDto dto) {
//		return new ResponseEntity<>(productService.getAllProductUsingPaginationList(dto),HttpStatus.OK);
//	}

	
	@PostMapping("/queryMethod/{quantity}")
	public Page<Product> getAllStudentUsingPaginationByQuery(@RequestBody SortProductDto dto,@PathParam("quantity") String quantity){
		return productService.getAllStudentUsingPaginationByQuery(dto, quantity);
	}
}
