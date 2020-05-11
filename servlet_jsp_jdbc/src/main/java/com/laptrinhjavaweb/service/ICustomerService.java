package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.CustomerDTO;

public interface ICustomerService {
	List<CustomerDTO> findAll();
	Object  findId(long id);
	void Update(CustomerDTO customerDTO);
	void insert(CustomerDTO customerDTO);
	void deleteById(Long id);
	void deleteByCondition(String sql);
}
