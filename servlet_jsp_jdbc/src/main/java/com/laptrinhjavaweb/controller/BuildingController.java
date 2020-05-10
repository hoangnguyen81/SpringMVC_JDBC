package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.impl.BuildingService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuildingController {

	public static void main(String[] args) {
		BuildingDTO buildingDTO = new BuildingDTO();
		BuildingService buildingService = new BuildingService();
		
//		result = buidBuildingService.findAll();
//		for (BuildingDTO item : result) {
//			System.out.println("Name: " + item.getName());
//			System.out.println("Ward: " + item.getWard());
//			System.out.println("--------------------------------");
//		}
		
		// finId() method
//		buildingDTO = (BuildingDTO) buidBuildingService.findId(3);
//		System.out.println("Id: " + buildingDTO.getId());
//		System.out.println("Name: " + buildingDTO.getName());
//		System.out.println("Ward: " + buildingDTO.getWard());
		
		// insert() method
//		buildingDTO.setName("Bitexco");
//		buildingDTO.setWard("Bến Nghé");
//		buildingService.insert(buildingDTO);
		
		// deleteById() method
//		buildingService.deleteById(9L);
		
		// deleteByCondition() method
// 		String sql = "delete FROM building " + "WHERE id=8";
//		buildingService.deleteByCondition(sql);
		
		// update() method
//		buildingDTO.setId(9L);
//		buildingDTO.setName("Test");
//		buildingDTO.setWard("test");
//		buildingService.Update(buildingDTO);
	}
}
