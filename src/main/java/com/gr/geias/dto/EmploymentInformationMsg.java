package com.gr.geias.dto;

import com.gr.geias.entity.EmploymentInformation;
import lombok.Data;

import java.util.List;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-07 19:01
 */
@Data
public class EmploymentInformationMsg {
    private Boolean success;
    private List<EmploymentInformation> list;
    private Integer count;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<EmploymentInformation> getList() {
        return list;
    }

    public void setList(List<EmploymentInformation> list) {
        this.list = list;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
