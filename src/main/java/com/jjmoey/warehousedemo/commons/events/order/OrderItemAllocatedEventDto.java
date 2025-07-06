package com.jjmoey.warehousedemo.commons.events.order;

import com.jjmoey.warehousedemo.commons.AbstractEventDto;

public class OrderItemAllocatedEventDto extends AbstractEventDto {
    private Integer orderId;
    private String skuRef;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSkuRef() {
        return skuRef;
    }

    public void setSkuRef(String skuRef) {
        this.skuRef = skuRef;
    }

    @Override
    public Integer getKey() { 
        return orderId; 
    }

    @Override
    public String getType() { 
        return OrderItemAllocatedEventDto.class.getName(); 
    }
} 