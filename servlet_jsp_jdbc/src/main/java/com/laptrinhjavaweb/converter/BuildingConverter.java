package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

public class BuildingConverter {
	ModelMapper modelMapper = new ModelMapper();
	
	public BuildingDTO convertToDTO(BuildingEntity buildingEntity) {
		BuildingDTO dto = modelMapper.map(buildingEntity,BuildingDTO.class);
		return dto;
	}
	public BuildingEntity converToEntity (BuildingDTO buildingDTO) {
		BuildingEntity enity = modelMapper.map(buildingDTO, BuildingEntity.class);
		return enity;
	}
}
