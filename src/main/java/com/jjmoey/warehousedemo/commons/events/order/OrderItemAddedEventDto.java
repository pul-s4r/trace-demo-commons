package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.AbstractEventDto;
import com.jjmoey.warehousedemo.commons.dto.OrderLineDto;

public class OrderItemAddedEventDto extends AbstractEventDto {
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

    @Override
    public Integer getKey() { return orderId; }

    @Override
    public String getType() { return OrderItemAddedEventDto.class.getName(); }
}
