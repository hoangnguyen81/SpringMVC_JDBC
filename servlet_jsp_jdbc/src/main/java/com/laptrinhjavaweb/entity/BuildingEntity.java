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
	private long id;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
