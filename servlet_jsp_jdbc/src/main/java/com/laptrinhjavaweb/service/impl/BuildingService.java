package com.laptrinhjavaweb.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService{
	IBuildingRepository buildingRepository = new BuildingRepository();
	BuildingConverter buildingConverter = new BuildingConverter();
	@Override
	public List<BuildingDTO> findAll() {
		List<BuildingDTO> listBuildingDTOs = new ArrayList<BuildingDTO>();
		List<BuildingEntity> listBuildingEntities = new ArrayList<BuildingEntity>();
		listBuildingEntities = buildingRepository.findAll();
		for(BuildingEntity item : listBuildingEntities) {
//			BuildingDTO buildingDTO = new BuildingDTO();
//			buildingDTO.setId(item.getId());
//			buildingDTO.setName(item.getName());
//			buildingDTO.setWard(item.getWard());
//			buildingDTO.setDistrict(item.getDistrict());
			BuildingDTO buildingDTO = buildingConverter.convertToDTO(item);
			listBuildingDTOs.add(buildingDTO);
		}
		return listBuildingDTOs;
	}

    @Override
    public List<BuildingDTO> finaAll(BuildingSearchBuilder builder) {
	    List<BuildingDTO> results = new ArrayList<>();
		Map<String, Object> params = convertDataToMap(builder);

	    List<BuildingEntity> buildingEntities = buildingRepository.findAll(builder,params);
	    for(BuildingEntity item : buildingEntities){
            BuildingDTO buildingDTO = buildingConverter.convertToDTO(item);
            results.add(buildingDTO);

        }
        return results;
    }

	private Map<String, Object> convertDataToMap(BuildingSearchBuilder builder) {
		Map<String,Object> results = new HashMap<>();
		try{
			Field[] fields = BuildingSearchBuilder.class.getDeclaredFields();
			for(Field field : fields){
				if(!field.getName().startsWith("areaRent") && !field.getName().equals("types")
				&& !field.getName().startsWith("costRent") ){
					field.setAccessible(true);
					results.put(field.getName(), field.get(builder));
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return  null;
		}

		return results;
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
		buildingEntity.setDistrict(buildingDTO.getDistrict());
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
