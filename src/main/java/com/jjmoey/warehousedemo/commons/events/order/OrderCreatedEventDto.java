package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.dto.OrderLineDto;

import java.util.HashSet;
import java.util.Set;

public class OrderCreatedEventDto {
    private Integer orderId;
    private String orderReference;
    private Set<OrderLineDto> items;

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

    public Set<OrderLineDto> getItems() {
        if (items == null) {
            items = new HashSet<>();
        }
        return items;
    }

    public void setItems(Set<OrderLineDto> items) {
        this.items = items;
    }
}
