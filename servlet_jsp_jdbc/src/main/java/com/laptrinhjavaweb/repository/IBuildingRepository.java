package com.laptrinhjavaweb.repository;

import java.util.List;

import com.laptrinhjavaweb.entity.BuildingEntity;

public interface IBuildingRepository extends ISimpleJpaRepository<BuildingEntity> {
	List<BuildingEntity> findAll();
}
