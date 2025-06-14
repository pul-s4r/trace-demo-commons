package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.AbstractEventDto;

public class OrderItemStatusUpdatedEventDto extends AbstractEventDto {
    private Integer orderId;
    private String itemSku;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Integer getKey() { return orderId; }

    @Override
    public String getType() { return OrderItemStatusUpdatedEventDto.class.getName(); }
}
