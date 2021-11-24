package com.pucpr.pucbay.model.tables;

import javax.persistence.*;

@Entity
public class Attributes {

    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private String value_name;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue_name() {
        return value_name;
    }

    public void setValue_name(String value_name) {
        this.value_name = value_name;
    }
}
