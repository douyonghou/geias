package com.gr.geias.dto;

import lombok.Data;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-08 13:50
 */
@Data
public class AreaCount {
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
