package com.laptrinhjavaweb.builder;

public class BuildingSearchBuilder {

    private String name;
    private String ward;
    private String street;
    private String district;
    private String floorArea;
    private String numberofBasement;
    private Integer areaRentFrom;
    private Integer areaRentTo;
    private Integer costRentFrom;
    private Integer costRentTo;
    private String[] types = new String[]{};

    private BuildingSearchBuilder(Builder builder) {
        this.name = builder.name;
        this.ward = builder.ward;
        this.street = builder.street;
        this.district = builder.district;
        this.floorArea = builder.floorArea;
        this.numberofBasement = builder.numberofBasement;
        this.areaRentFrom = builder.areaRentFrom;
        this.areaRentTo = builder.areaRentTo;
        this.costRentFrom = builder.costRentFrom;
        this.costRentTo = builder.costRentTo;
        this.types = builder.types;

    }

    public String getName() {
        return name;
    }

    public String getWard() {
        return ward;
    }

    public String getStreet() {
        return street;
    }

    public String getDistrict() {
        return district;
    }

    public String getFloorArea() {
        return floorArea;
    }

    public String getNumberofBasement() {
        return numberofBasement;
    }

    public Integer getAreaRentFrom() {
        return areaRentFrom;
    }

    public Integer getAreaRentTo() {
        return areaRentTo;
    }

    public Integer getCostRentFrom() {
        return costRentFrom;
    }

    public Integer getCostRentTo() {
        return costRentTo;
    }

    public String[] getTypes() {
        return types;
    }

    //Builder Class
    public static class Builder{

        private String name;
        private String ward;
        private String street;
        private String district;
        private String floorArea;
        private String numberofBasement;
        private Integer areaRentFrom;
        private Integer areaRentTo;
        private Integer costRentFrom;
        private Integer costRentTo;
        private String[] types = new String[]{};


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWard(String ward) {
            this.ward = ward;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public Builder setFloorArea(String floorArea) {
            this.floorArea = floorArea;
            return this;
        }

        public Builder setNumberofBasement(String numberofBasement) {
            this.numberofBasement = numberofBasement;
            return this;
        }

        public Builder setAreaRentFrom(Integer areaRentFrom) {
            this.areaRentFrom = areaRentFrom;
            return this;
        }

        public Builder setAreaRentTo(Integer areaRentTo) {
            this.areaRentTo = areaRentTo;
            return this;
        }

        public Builder setCostRentFrom(Integer costRentFrom) {
            this.costRentFrom = costRentFrom;
            return this;
        }

        public Builder setCostRentTo(Integer costRentTo) {
            this.costRentTo = costRentTo;
            return this;
        }

        public Builder setTypes(String[] types) {
            this.types = types;
            return this;
        }

        public BuildingSearchBuilder build(){
            return new BuildingSearchBuilder(this);
        }

    }
}
