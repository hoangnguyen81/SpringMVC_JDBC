package com.laptrinhjavaweb.controller;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.impl.BuildingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.BuildingDTO;

@Controller
public class BuildingController {
	private IBuildingService buildingService = new BuildingService();
	@RequestMapping(value = "/admin/building/list", method = RequestMethod.GET)
	public ModelAndView homePage(@ModelAttribute("model") BuildingDTO model){
		ModelAndView mav = new ModelAndView("admin/building/list");
		BuildingSearchBuilder builder = new BuildingSearchBuilder.Builder()
				.setName(model.getName())
				.setWard(model.getWard())
				.setStreet(model.getStreet())
				.setDistrict(model.getDistrict())
				.setFloorArea(model.getFloorArea())
				.setNumberofBasement(model.getNumberofBasement())
				.build();
		mav.addObject("buildings",buildingService.finaAll(builder));
		mav.addObject("model",model);
		return mav;
	}

	@RequestMapping(value = "/admin/building/edit", method = RequestMethod.GET)
	public ModelAndView buildingEdit(){
		ModelAndView mav = new ModelAndView("admin/building/edit");
		return mav;
	}

	public static void main(String[] args) {

	}
}
