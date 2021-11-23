package com.pucpr.pucbay.model.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estate{

    @Id
    private String estate_id;
    private String name;

    public Estate() {
    }

    public Estate(String estate_id, String name) {
        this.estate_id = estate_id;
        this.name = name;
    }

    public String getEstate_id() {
        return estate_id;
    }

    public void setEstate_id(String id) {
        this.estate_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
