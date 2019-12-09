package com.cursor.hw4.task1.planeshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.PerimeterMeasurable;

import java.util.HashMap;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private HashMap<String, Double> coordinates = new HashMap<>();
    private Double radius;

    public Circle(double x1, double x2, double radius) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {

        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Circle: area - " + calculateArea() + " cm\u00B2; " + "perimeter - " + calculatePerimeter() + " cm; " +
                "coordinates - " + coordinates + "; radius - " + radius + " cm; ";
    }
}
