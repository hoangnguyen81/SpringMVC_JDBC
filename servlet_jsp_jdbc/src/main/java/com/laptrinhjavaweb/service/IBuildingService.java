package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.dto.BuildingDTO;

public interface IBuildingService {
	List<BuildingDTO> findAll();
	List<BuildingDTO> finaAll(BuildingSearchBuilder builder);
	Object  findId(long id);
	void Update(BuildingDTO buildingDTO);
	void insert(BuildingDTO buildingDTO);
	void deleteById(Long id);
	void deleteByCondition(String sql);
	
}
