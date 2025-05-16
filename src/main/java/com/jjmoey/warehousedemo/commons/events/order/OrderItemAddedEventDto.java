package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.dto.OrderLineDto;

public class OrderItemAddedEventDto {
    private Integer orderId;
    private OrderLineDto item;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OrderLineDto getItem() {
        return item;
    }

    public void setItem(OrderLineDto item) {
        this.item = item;
    }
}
