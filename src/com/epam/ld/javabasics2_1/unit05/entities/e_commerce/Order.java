package com.epam.ld.javabasics2_1.unit05.entities.e_commerce;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Order {

    private final String id;
    private Map<SKU, Long> items = new HashMap<>();
    private String orderedBy;

    public Order(String id) {
        this(id, "anonymous");
    }

    public Order(String id, String orderedBy) {
        this.id = id;
        this.orderedBy = orderedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
