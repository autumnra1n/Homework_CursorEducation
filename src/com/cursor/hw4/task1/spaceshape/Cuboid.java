package com.cursor.hw4.task1.spaceshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.Shape;
import com.cursor.hw4.task1.interfaces.VolumeMeasurable;

import java.util.HashMap;

public class Cuboid extends Shape implements AreaMeasurable, VolumeMeasurable {
    HashMap<String, Double> coordinates = new HashMap<>();

    private Double width;
    private Double height;
    private Double depth;

    public Cuboid(double x1, double x2, double width, double height, double depth) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return Math.round(2 * (width * height + height * depth + width * depth) * 100.0) / 100.0;
    }

    @Override
    public double getVolume() {
        return Math.round(width * height * height * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Cuboid: area - " + getArea() + "cm2; " + "volume - " + getVolume() + "cm3; " + "coordinates - " +
                coordinates + "; " + "width - " + width + "cm; " + "height - " + height + "cm; " + "depth - " + depth +
                "cm;";
    }
}