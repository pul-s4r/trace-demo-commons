package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.AbstractEventDto;

public class OrderItemQuantityUpdatedEventDto extends AbstractEventDto {
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

    @Override
    public Integer getKey() { return orderId; }

    @Override
    public String getType() { return OrderItemQuantityUpdatedEventDto.class.getName(); }
}
