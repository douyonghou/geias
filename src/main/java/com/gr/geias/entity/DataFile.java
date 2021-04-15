package com.gr.geias.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : DataFile
 * @Description : 数据文件
 * @Author : douyonghou
 * @Date: 2021-04-10 23:07
 */
public class DataFile implements Serializable {
    private Integer information_id;
    private Integer student_num;
    private String name;
    private Integer gender;
    private Integer college_id;
    private Integer specialty_id;
    private Integer class_id;
    private Integer area_id;
    private Integer unit_id;
    private Integer employment_way_id;
    private String salary;
    private String create_time;
    private String msg;

    public Integer getInformation_id() {
        return information_id;
    }

    public void setInformation_id(Integer information_id) {
        this.information_id = information_id;
    }

    public Integer getStudent_num() {
        return student_num;
    }

    public void setStudent_num(Integer student_num) {
        this.student_num = student_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCollege_id() {
        return college_id;
    }

    public void setCollege_id(Integer college_id) {
        this.college_id = college_id;
    }

    public Integer getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(Integer specialty_id) {
        this.specialty_id = specialty_id;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public Integer getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(Integer unit_id) {
        this.unit_id = unit_id;
    }

    public Integer getEmployment_way_id() {
        return employment_way_id;
    }

    public void setEmployment_way_id(Integer employment_way_id) {
        this.employment_way_id = employment_way_id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
