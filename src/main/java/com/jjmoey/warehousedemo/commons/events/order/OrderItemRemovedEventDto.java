package com.jjmoey.warehousedemo.commons.events.order;

public class OrderItemRemovedEventDto {
    private Integer orderId;
    private String itemSku;

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
}
