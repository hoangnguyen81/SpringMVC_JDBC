package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.CustomerDTO;
import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.repository.ICustomerRepository;
import com.laptrinhjavaweb.repository.impl.CustomerRepository;
import com.laptrinhjavaweb.service.ICustomerService;

public class CustomerService implements ICustomerService {
	ICustomerRepository customerRepository = new CustomerRepository();
	@Override
	public List<CustomerDTO> findAll() {
		List<CustomerDTO> listCustomerDTO = new ArrayList<CustomerDTO>();
		List<CustomerEntity> listCustomerEntity = new ArrayList<CustomerEntity>();
		listCustomerEntity = customerRepository.findAll();
		for(CustomerEntity item : listCustomerEntity) {
			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setFullname(item.getFullname());
			customerDTO.setPhone(item.getPhone());
			customerDTO.setEmail(item.getEmail());
			listCustomerDTO.add(customerDTO);
		}
		return listCustomerDTO;
	}
	@Override
	public Object findId(long id) {
		CustomerDTO customerDTO = new CustomerDTO();
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity = (CustomerEntity) customerRepository.findId(id);
		customerDTO.setId(customerEntity.getId());
		customerDTO.setFullname(customerEntity.getFullname());
		customerDTO.setPhone(customerEntity.getPhone());
		customerDTO.setEmail(customerEntity.getEmail());
		return customerDTO;
	}
	
	@Override
	public void Update(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity();
		customerDTO.setId(customerEntity.getId());
		customerDTO.setFullname(customerEntity.getFullname());
		customerDTO.setPhone(customerEntity.getPhone());
		customerDTO.setEmail(customerEntity.getEmail());
		customerRepository.Update(customerEntity);
	}
	@Override
	public void insert(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity();
		customerDTO.setFullname(customerEntity.getFullname());
		customerDTO.setPhone(customerEntity.getPhone());
		customerDTO.setEmail(customerEntity.getEmail());
		customerRepository.insert(customerEntity);
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setId(id);
		customerRepository.deleteById(customerEntity.getId());
	}
	@Override
	public void deleteByCondition(String sql) {
		// TODO Auto-generated method stub
		customerRepository.deleteByCondition(sql);
	}
}
