package com.epam.ld.javabasics2_1.unit05.entities.delivery;

import java.util.LinkedList;
import java.util.Queue;

public class PickPoint {

    private String name;
    private Queue<Delivery> deliveries = new LinkedList<>();

}
