package com.laptrinhjavaweb.repository;

import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.entity.BuildingEntity;

public interface IBuildingRepository extends ISimpleJpaRepository<BuildingEntity> {
//	List<BuildingEntity> findAll();
    List<BuildingEntity> findAll(BuildingSearchBuilder builder, Map<String, Object> params);
}
