package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.CustomerDTO;
import com.laptrinhjavaweb.service.impl.CustomerService;

public class CustomerController {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		CustomerDTO customerDTO = new CustomerDTO();
		List<CustomerDTO> lisCustomerDTOs = new ArrayList<CustomerDTO>();
		lisCustomerDTOs = customerService.findAll();
//		for (CustomerDTO item : lisCustomerDTOs) {
//			System.out.println("Fullname: " + item.getFullname());
//			System.out.println("Phone: " + item.getPhone());
//			System.out.println("Email: " + item.getEmail());
//			System.out.println("-------------------------------");
//		}
		customerDTO = (CustomerDTO) customerService.findId(1);
		System.out.println("Id: " + customerDTO.getId());
		System.out.println("FullName: " + customerDTO.getFullname());
		System.out.println("Phone: " + customerDTO.getPhone());
		System.out.println("Email: " + customerDTO.getEmail());
	}
}
