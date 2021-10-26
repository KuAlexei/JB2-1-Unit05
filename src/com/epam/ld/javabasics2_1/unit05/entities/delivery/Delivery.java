package com.epam.ld.javabasics2_1.unit05.entities.delivery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Delivery {

    private final LocalDateTime dateTime;
    private final String restaurant;
    private final String deliveryAddress;
    private List<String> foodList = new ArrayList<>();
    private Double totalCost = 0.0;
    private String deliveryman;

    public Delivery(LocalDateTime dateTime, String restaurant, String deliveryAddress) {
        this.dateTime = dateTime;
        this.restaurant = restaurant;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return dateTime.equals(delivery.dateTime) && restaurant.equals(delivery.restaurant) && deliveryAddress.equals(delivery.deliveryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, restaurant, deliveryAddress);
    }
}
