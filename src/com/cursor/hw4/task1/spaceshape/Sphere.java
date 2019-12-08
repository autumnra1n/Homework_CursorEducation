package com.cursor.hw4.task1.spaceshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.Shape;
import com.cursor.hw4.task1.interfaces.VolumeMeasurable;

import java.util.HashMap;

public class Sphere extends Shape implements AreaMeasurable, VolumeMeasurable {
    HashMap<String, Double> coordinates = new HashMap<>();
    private Double radius;

    public Sphere(double x1, double x2, double radius) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(4 * Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    @Override
    public double getVolume() {
        return Math.round(4 * Math.PI * Math.pow(radius, 3) / 3 * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Sphere: area - " + getArea() + "cm2; " + "volume - " + getVolume() + "cm3; " + "coordinates - " +
                coordinates + "; " + "radius - " + radius + ";";
    }
}
