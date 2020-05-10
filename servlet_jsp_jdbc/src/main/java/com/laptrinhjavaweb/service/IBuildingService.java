package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;

public interface IBuildingService {
	List<BuildingDTO> findAll();
	Object  findId(long id);
	void Update(BuildingDTO buildingDTO);
	void insert(BuildingDTO buildingDTO);
	void deleteById(Long id);
	void deleteByCondition(String sql);
}
