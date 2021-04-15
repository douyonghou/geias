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
public class PersonInfo implements Serializable {

    private Integer personId;

    private Integer enableStatus;

    private String personName;

    private Date createTime;

    private String password;

    private String username;

    private Integer collegeId;

    private String faceToken;

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    public Integer getPersonId() {
        return personId;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public String getPersonName() {
        return personName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public String getFaceToken() {
        return faceToken;
    }
}
