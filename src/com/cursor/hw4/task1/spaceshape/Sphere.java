package com.cursor.hw4.task1.spaceshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.VolumeMeasurable;

import java.util.HashMap;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private HashMap<String, Double> coordinates = new HashMap<>();

    public Sphere(double x1, double x2, double radius) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(4 * Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    @Override
    public double calculateVolume() {
        return Math.round(4 * Math.PI * Math.pow(radius, 3) / 3 * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Sphere: area - " + calculateArea() + " cm\u00B2; " + "volume - " + calculateVolume() + " cm\u00B3; " + "coordinates - " +
                coordinates + "; " + "radius - " + radius + " cm;";
    }
}
