package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jca.cci.object.EisOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.enums.DistrictEnum;
import com.laptrinhjavaweb.service.impl.BuildingService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/building", "/building-edit" })
public class BuildingController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String urlPath = req.getServletPath();
		if (urlPath.equals("/building")) {
			RequestDispatcher rd = req.getRequestDispatcher("/view/building.jsp");
			rd.forward(req, resp);
		}
		if (urlPath.equals("/building-edit")) {
			RequestDispatcher rd = req.getRequestDispatcher("/view/building_edit.jsp");
			rd.forward(req, resp);
		}
	}

	public static void main(String[] args) {
		BuildingDTO buildingDTO = new BuildingDTO();
		BuildingService buildingService = new BuildingService();
//		System.out.println(buildingDTO.getClass());
//		for (BuildingDTO item : buildingService.findAll()) {
//			System.out.println("Id: " + item.getId());
//			System.out.println("Name: " + item.getName());
//			System.out.println("Ward: " + item.getWard());
//			//System.out.println("District: " + item.getDistrict());
//			for (DistrictEnum district : DistrictEnum.values()) {
//				if (district.name().equals(item.getDistrict())) {
//					System.out.println("District: " + district.getValue());
//					break;
//				}
//			}
//			System.out.println("--------------------------------");
//		}

		// finId() method
//		buildingDTO = (BuildingDTO) buildingService.findId(4);
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
		buildingDTO.setId(1L);
		buildingDTO.setName("BBB");
		buildingService.Update(buildingDTO);
	}
}
