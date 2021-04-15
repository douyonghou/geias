package com.gr.geias.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author maotentai
 * @since 2020-03-06
 */
@Data
public class EmploymentInformation implements Serializable {

    private Integer informationId;

    private Integer studentNum;

    private String name;

    private ClassGrade classGrade;

    private Area area;

    private UnitKind unitKind;

    private String salary;

    private EmploymentWay employmentWay;

    private String msg;

    private Date createTime;

    private College college;

    private Specialty specialty;

    private Integer gender;

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(ClassGrade classGrade) {
        this.classGrade = classGrade;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public UnitKind getUnitKind() {
        return unitKind;
    }

    public void setUnitKind(UnitKind unitKind) {
        this.unitKind = unitKind;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public EmploymentWay getEmploymentWay() {
        return employmentWay;
    }

    public void setEmploymentWay(EmploymentWay employmentWay) {
        this.employmentWay = employmentWay;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
