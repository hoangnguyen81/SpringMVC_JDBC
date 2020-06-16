package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;

import java.util.Date;

@Entity
@Table(name = "building")
public class BuildingEntity {
	@Column(name ="name")
	private String name;
	@Column(name = "street")
	private String street;
	@Column(name = "ward")
	private String ward;
	@Column(name = "district")
	private String district;
	@Column(name = "createddate")
	private Date createddate;
	@Column(name = "modifieddate")
	private Date modifieddate;
	@Column(name = "createdby")
	private String createdby;
	@Column(name = "modifiedby")
	private String modifiedby;
	@Column(name = "id")
	private Long id;


	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return this.name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
}
