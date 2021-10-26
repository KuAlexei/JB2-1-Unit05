package com.epam.ld.javabasics2_1.unit05.entities.e_commerce;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private final String id;
    private String name;
    private Set<SKU> skus = new HashSet<>();

    public Product(String id) {
        this.id = id;
    }

    public Product(String id, Set<SKU> skus) {
        this(id);
        this.skus.addAll(skus);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
