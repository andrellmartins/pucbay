package com.pucpr.pucbay.model.base_table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_address")
public class Address{

    @Id
    @GeneratedValue
    private int address_id;
    private int city_id;
    private int estate_id;
    private int country_id;

    public Address() {
    }

    public Address(int address_id, int city_id, int estate_id, int country_id) {
        this.address_id = address_id;
        this.city_id = city_id;
        this.estate_id = estate_id;
        this.country_id = country_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getEstate_id() {
        return estate_id;
    }

    public void setEstate_id(int estate_id) {
        this.estate_id = estate_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
}
