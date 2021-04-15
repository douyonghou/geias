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
public class EmploymentWay implements Serializable {

    private Integer employmentWayId;

    private String vayName;

    private Date createTime;

    public Integer getEmploymentWayId() {
        return employmentWayId;
    }

    public void setEmploymentWayId(Integer employmentWayId) {
        this.employmentWayId = employmentWayId;
    }

    public String getVayName() {
        return vayName;
    }

    public void setVayName(String vayName) {
        this.vayName = vayName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
