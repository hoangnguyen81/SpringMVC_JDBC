package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;

@Entity
@Table(name = "building")
public class BuildingEntity {
	@Column(name ="name")
	private String name;
	@Column(name = "ward")
	private String ward;
	@Column(name = "id")
	private Long id;
	@Column(name = "district")
	private String district;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getWard() {
		return this.ward;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
}
