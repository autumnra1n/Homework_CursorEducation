package com.cursor.hw4.task1.planeshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.PerimeterMeasurable;

import java.util.HashMap;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private HashMap<String, Double> coordinates = new HashMap<>();

    private Double width;
    private Double height;

    public Rectangle(double x1, double x2, double width, double height) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round(width * height * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(2 * (width + height) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Rectangle: area - " + calculateArea() + " cm\u00B2; " + "perimeter - " + calculatePerimeter() + " cm; " + "coordinates - "
                + coordinates + "; width - " + width + " cm; " + "height - " + height + " cm;";
    }
}
