package com.pucpr.pucbay.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_product")
public class Product extends Resource {

    @Id
    @GeneratedValue
    private String id;
    private String site_id;
    private String title;
    private int id_integracao;
    private int subtitle;
    private int seller_id;
    private double price;
    private double base_price;
    private double original_price;
    private String currency_id;
    private int initial_quantity;
    private int available_quantity;
    private String start_time;
    private String stop_time;
    private String condition;
    private String permalink;


    public Product() {
    }

    public Product(String id, String site_id, String title, int id_integracao, int subtitle, int seller_id, double price, double base_price, double original_price, String currency_id, int initial_quantity, int available_quantity, String start_time, String stop_time, String condition, String permalink) {
        this.id = id;
        this.site_id = site_id;
        this.title = title;
        this.id_integracao = id_integracao;
        this.subtitle = subtitle;
        this.seller_id = seller_id;
        this.price = price;
        this.base_price = base_price;
        this.original_price = original_price;
        this.currency_id = currency_id;
        this.initial_quantity = initial_quantity;
        this.available_quantity = available_quantity;
        this.start_time = start_time;
        this.stop_time = stop_time;
        this.condition = condition;
        this.permalink = permalink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId_integracao() {
        return id_integracao;
    }

    public void setId_integracao(int id_integracao) {
        this.id_integracao = id_integracao;
    }

    public int getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(int subtitle) {
        this.subtitle = subtitle;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(double original_price) {
        this.original_price = original_price;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public int getInitial_quantity() {
        return initial_quantity;
    }

    public void setInitial_quantity(int initial_quantity) {
        this.initial_quantity = initial_quantity;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStop_time() {
        return stop_time;
    }

    public void setStop_time(String stop_time) {
        this.stop_time = stop_time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }
}