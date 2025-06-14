package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.AbstractEventDto;

public class OrderItemRemovedEventDto extends AbstractEventDto {
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

    @Override
    public Integer getKey() { return orderId; }

    @Override
    public String getType() { return OrderItemRemovedEventDto.class.getName(); }
}
