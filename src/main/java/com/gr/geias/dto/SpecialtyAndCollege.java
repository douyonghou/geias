package com.gr.geias.dto;

import com.gr.geias.entity.College;
import com.gr.geias.entity.Specialty;
import lombok.Data;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-10 11:09
 */
@Data
public class SpecialtyAndCollege {
    private Specialty specialty;
    private College college;
    private Integer sum;

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
