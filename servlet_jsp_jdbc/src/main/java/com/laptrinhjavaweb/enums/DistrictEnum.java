package com.laptrinhjavaweb.enums;

public enum DistrictEnum {

    QUAN_1 ("Q1"),
    QUAN_2 ("Q1"),
    QUAN_3 ("Q1"),
    QUAN_4 ("Q1"),
    QUAN_5 ("Q1"),
    QUAN_6 ("Q1"),
    QUAN_7 ("Q1"),
    QUAN_8 ("Q1"),
    QUAN_9 ("Q1"),
    QUAN_10 ("Q1"),
    QUAN_11 ("Q1"),
    QUAN_12 ("Q1"),
    QUAN_BINH_TAN ("Q1"),
    QUAN_BINH_THANH ("Q1"),
    QUAN_GO_VAP ("Q1");


    private String value;
    DistrictEnum(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
