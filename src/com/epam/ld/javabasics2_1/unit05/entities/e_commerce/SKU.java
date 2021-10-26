package com.epam.ld.javabasics2_1.unit05.entities.e_commerce;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SKU {

    private final String id;
    private String productId;
    private Map<String, String> properties = new HashMap<>();
    private long availableCount;

    public SKU(String id) {
        this(id,0);
    }
    public SKU(String id, long count) {
        this.id = id;
        this.availableCount = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SKU sku = (SKU) o;
        return id.equals(sku.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
