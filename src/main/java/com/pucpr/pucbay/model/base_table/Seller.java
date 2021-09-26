package com.pucpr.pucbay.model.base_table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_seller")
public class Seller{
    @Id
    @GeneratedValue
    private int seller_id;
    private int address_id;
    private String seller_contact;

    public Seller() {
    }

    public Seller(int seller_id, int address_id, String seller_contact) {
        this.seller_id = seller_id;
        this.address_id = address_id;
        this.seller_contact = seller_contact;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getSeller_contact() {
        return seller_contact;
    }

    public void setSeller_contact(String seller_contact) {
        this.seller_contact = seller_contact;
    }
}
