package com.ck.entity;

/**
 * @author longhuan
 * @create 2021-05-13-10:08
 */
public class Good {
    private int g_id;
    private String g_name;
    private int g_price;
    private int g_stock;
    private String g_desc;

    public Good(int g_id, String g_name, int g_price, int g_stock, String g_desc) {
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_price = g_price;
        this.g_stock = g_stock;
        this.g_desc = g_desc;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public int getG_price() {
        return g_price;
    }

    public void setG_price(int g_price) {
        this.g_price = g_price;
    }

    public int getG_stock() {
        return g_stock;
    }

    public void setG_stock(int g_stock) {
        this.g_stock = g_stock;
    }

    public String getG_desc() {
        return g_desc;
    }

    public void setG_desc(String g_desc) {
        this.g_desc = g_desc;
    }

    public Good() {
    }

    @Override
    public String toString() {
        return "Good{" +
                "g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                ", g_price=" + g_price +
                ", g_stock=" + g_stock +
                ", g_desc='" + g_desc + '\'' +
                '}';
    }
}
