package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.annotation.Column;

import java.util.Date;

public class BuildingDTO {

	private String name;
	private String street;
	private String ward;
	private Long id;
	private String district;
	private String floorArea;
	private String numberofBasement;
	private Integer areaRentFrom;
	private Integer areaRentTo;
	private Integer costRentFrom;
	private Integer costRentTo;
	private String[] types = new String[]{};
	private Date createddate;
	private Date modifieddate;
	private String createdby;
	private String modifiedby;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

	public String getNumberofBasement() {
		return numberofBasement;
	}

	public void setNumberofBasement(String numberofBasement) {
		this.numberofBasement = numberofBasement;
	}

	public Integer getAreaRentFrom() {
		return areaRentFrom;
	}

	public void setAreaRentFrom(Integer areaRentFrom) {
		this.areaRentFrom = areaRentFrom;
	}

	public Integer getAreaRentTo() {
		return areaRentTo;
	}

	public void setAreaRentTo(Integer areaRentTo) {
		this.areaRentTo = areaRentTo;
	}

	public Integer getCostRentFrom() {
		return costRentFrom;
	}

	public void setCostRentFrom(Integer costRentFrom) {
		this.costRentFrom = costRentFrom;
	}

	public Integer getCostRentTo() {
		return costRentTo;
	}

	public void setCostRentTo(Integer costRentTo) {
		this.costRentTo = costRentTo;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
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
