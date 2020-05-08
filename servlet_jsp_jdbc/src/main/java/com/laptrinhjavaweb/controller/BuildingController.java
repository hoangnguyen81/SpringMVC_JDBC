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

@WebServlet(urlPatterns = {"/building"})
public class BuildingController {
	
		BuildingService buidBuildingService = new BuildingService();
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		BuildingDTO buildingDTO = new BuildingDTO();
//		result = buidBuildingService.findAll();
//		for (BuildingDTO item : result) {
//			System.out.println("Name: " + item.getName());
//			System.out.println("Ward: " + item.getWard());
//			System.out.println("--------------------------------");
//		}
//		buildingDTO = (BuildingDTO) buidBuildingService.findId(3);
//		System.out.println("Id: " + buildingDTO.getId());
//		System.out.println("Name: " + buildingDTO.getName());
//		System.out.println("Ward: " + buildingDTO.getWard());
		/**
		 * 
		 */
		private static final long serialVersionUID = -7612285712070391434L;
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			RequestDispatcher rd = req.getRequestDispatcher("/view/building.jsp");
			rd.forward(req, resp);
		}
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		}
		protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		}

	
}
