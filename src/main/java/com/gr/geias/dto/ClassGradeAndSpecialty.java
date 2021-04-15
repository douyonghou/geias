package com.gr.geias.dto;

import com.gr.geias.entity.ClassGrade;
import com.gr.geias.entity.PersonInfo;
import com.gr.geias.entity.Specialty;
import lombok.Data;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-10 15:57
 */
@Data
public class ClassGradeAndSpecialty {
    private ClassGrade classGrade;
    private Specialty specialty;
    private PersonInfo personInfo;
    private Integer sum;

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(ClassGrade classGrade) {
        this.classGrade = classGrade;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
