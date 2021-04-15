package com.gr.geias.entity;

import lombok.Data;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-09 09:03
 */
@Data
public class OrganizationNum {
    private Integer numId;
    private Integer sum;
    private Integer classId;
    private Integer collegeId;
    private Integer specialtyId;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }
}
