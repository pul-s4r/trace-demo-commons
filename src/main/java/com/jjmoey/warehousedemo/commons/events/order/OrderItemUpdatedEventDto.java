package com.jjmoey.warehousedemo.commons.events.order;

public class OrderItemUpdatedEventDto {
    private Integer orderId;
    private String itemSku;
    private Integer itemQuanitity;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getItemSku() {
        return itemSku;
    }

    public void setItemSku(String itemSku) {
        this.itemSku = itemSku;
    }

    public Integer getItemQuanitity() {
        return itemQuanitity;
    }

    public void setItemQuanitity(Integer itemQuanitity) {
        this.itemQuanitity = itemQuanitity;
    }
}
