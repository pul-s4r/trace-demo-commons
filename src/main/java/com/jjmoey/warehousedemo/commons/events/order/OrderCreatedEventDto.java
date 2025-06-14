package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.AbstractEventDto;
import com.jjmoey.warehousedemo.commons.dto.OrderLineDto;

import java.util.ArrayList;
import java.util.List;

public class OrderCreatedEventDto extends AbstractEventDto {
    private Integer orderId;
    private String orderReference;
    private List<OrderLineDto> items;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public List<OrderLineDto> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public void setItems(List<OrderLineDto> items) {
        this.items = items;
    }

    @Override
    public Integer getKey() { return orderId; }

    @Override
    public String getType() { return OrderCreatedEventDto.class.getName(); }
}
