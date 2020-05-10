package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService{
	IBuildingRepository buildingRepository = new BuildingRepository();
	@Override
	public List<BuildingDTO> findAll() {
		List<BuildingDTO> listBuildingDTOs = new ArrayList<BuildingDTO>();
		List<BuildingEntity> listBuildingEntities = new ArrayList<BuildingEntity>();
		listBuildingEntities = buildingRepository.findAll();
		for(BuildingEntity item : listBuildingEntities) {
			BuildingDTO buildingDTO = new BuildingDTO();
			buildingDTO.setName(item.getName());
			buildingDTO.setWard(item.getWard());
			listBuildingDTOs.add(buildingDTO);
		}
		return listBuildingDTOs;
	}
	@Override
	public Object findId(long id) {
		BuildingDTO buildingDTO = new BuildingDTO();
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity = (BuildingEntity) buildingRepository.findId(id);
		buildingDTO.setId(buildingEntity.getId());
		buildingDTO.setName(buildingEntity.getName());
		buildingDTO.setWard(buildingEntity.getWard());
		return buildingDTO;
	}
	@Override
	public void Update(BuildingDTO buildingDTO) {
		// TODO Auto-generated method stub
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setId(buildingDTO.getId());
		buildingEntity.setName(buildingDTO.getName());
		buildingEntity.setWard(buildingDTO.getWard());
		buildingRepository.Update(buildingEntity);
	}
	@Override
	public void insert(BuildingDTO buildingDTO) {
		// TODO Auto-generated method stub
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setName(buildingDTO.getName());
		buildingEntity.setWard(buildingDTO.getWard());
		buildingRepository.insert(buildingEntity);
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		BuildingEntity buildingEntity = new BuildingEntity();
		buildingEntity.setId(id);
		buildingRepository.deleteById(buildingEntity.getId());
	}
	@Override
	public void deleteByCondition(String sql) {
		// TODO Auto-generated method stub
		buildingRepository.deleteByCondition(sql);
	}
}
