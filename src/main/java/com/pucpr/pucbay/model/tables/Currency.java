package com.pucpr.pucbay.model.tables;

import javax.persistence.*;

@Entity
public class Currency {


    @Id
    private String currency_id;
    private String name;

    public Currency() {
    }

    public Currency(String id, String name) {
        this.currency_id = id;
        this.name = name;
    }

    public String getId() {
        return currency_id;
    }

    public void setId(String id) {
        this.currency_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
