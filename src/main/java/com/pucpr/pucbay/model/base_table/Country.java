package com.pucpr.pucbay.model.base_table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_country")
public class Country{

    @Id
    @GeneratedValue
    private String country_id;
    private String name;

    public Country() {
    }

    public Country(String id, String name) {
        this.country_id = id;
        this.name = name;
    }

    public String getId() {
        return country_id;
    }

    public void setId(String id) {
        this.country_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
