package com.boot.tutorial.dto;

import java.util.Objects;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class SortProductDto {
	
	private Integer pageNo=0;
	
	private Integer pageSize=3;
	
	private Sort.Direction sort = Sort.Direction.DESC;
	
	private String sortByColumn="id";
	
	
	
	
	public Integer getPageNo() {
		return pageNo;
	}




	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}




	public Integer getPageSize() {
		return pageSize;
	}




	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}




	public Sort.Direction getSort() {
		return sort;
	}




	public void setSort(Sort.Direction sort) {
		this.sort = sort;
	}




	public String getSortByColumn() {
		return sortByColumn;
	}




	public void setSortByColumn(String sortByColumn) {
		this.sortByColumn = sortByColumn;
	}




	public Pageable getPageable(SortProductDto dto) {
		
		Integer page = Objects.nonNull(dto.getPageNo()) ? dto.getPageNo() : this.pageNo;
		
		Integer size = Objects.nonNull(dto.getPageSize()) ? dto.getPageSize() : this.pageSize;
		
		 Sort.Direction sort = Objects.nonNull(dto.getSort())  ? dto.getSort() : this.sort;
		  
		 String sortByColumn = Objects.nonNull(dto.getSortByColumn()) ? dto.getSortByColumn() : this.sortByColumn;
			 
		 PageRequest pagerequest = PageRequest.of(page, size, sort, sortByColumn);
		 
		 return pagerequest;
		
	}

}
