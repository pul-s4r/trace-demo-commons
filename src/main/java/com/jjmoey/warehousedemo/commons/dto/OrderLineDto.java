package com.jjmoey.warehousedemo.commons.dto;

public class OrderLineDto {
    private String sku;
    private int quantity;

    public OrderLineDto() {
    }

    public OrderLineDto(String sku, int quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}