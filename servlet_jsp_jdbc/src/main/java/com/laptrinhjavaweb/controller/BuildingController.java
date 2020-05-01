package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {
	public static void main(String[] args) {
		BuildingService buidBuildingService = new BuildingService();
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		BuildingDTO buildingDTO = new BuildingDTO();
//		result = buidBuildingService.findAll();
//		for (BuildingDTO item : result) {
//			System.out.println("Name: " + item.getName());
//			System.out.println("Ward: " + item.getWard());
//			System.out.println("--------------------------------");
//		}
		buildingDTO = (BuildingDTO) buidBuildingService.findId(3);
		System.out.println("Id: " + buildingDTO.getId());
		System.out.println("Name: " + buildingDTO.getName());
		System.out.println("Ward: " + buildingDTO.getWard());
	}
}
