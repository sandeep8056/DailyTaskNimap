package com.boot.tutorial.dto;

import java.util.Objects;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageRequestProductDto {

	private Integer pageNo = 0;

	private Integer pageSize = 5;

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


	
	
	public Pageable getPageAble(PageRequestProductDto dto) {
		Integer page = Objects.nonNull(dto.getPageNo()) ? dto.getPageNo() : this.pageNo;
		Integer size = Objects.nonNull(dto.getPageSize()) ? dto.getPageSize() : this.pageSize;
		PageRequest request = PageRequest.of(page, size);
		return request;
	}

}
