package com.pucpr.pucbay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_city")
public class City extends Resource {

    @Id
    @GeneratedValue
    private String city_id;
    private String name;

    public City() {
    }

    public City(String id, String name) {
        this.city_id = id;
        this.name = name;
    }

    public String getId() {
        return city_id;
    }

    public void setId(String id) {
        this.city_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
