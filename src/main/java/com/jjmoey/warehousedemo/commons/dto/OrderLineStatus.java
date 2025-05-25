package com.jjmoey.warehousedemo.commons.dto;

public enum OrderLineStatus {
    PENDING(true),
    ALLOCATION_IN_PROGRESS(true),
    ALLOCATED(true),
    FULFILLMENT_IN_PROGRESS(true),
    FULFILLMENT_BLOCKED(true),
    FULFILLMENT_FAILED(false),
    FULFILLED(false),
    REMOVED(false),
    ;

    private boolean active;

    OrderLineStatus(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

}
