package com.cursor.hw4.task1.spaceshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.Shape;
import com.cursor.hw4.task1.interfaces.VolumeMeasurable;

import java.util.HashMap;

import static java.lang.Math.sqrt;

public class SquarePyramid extends Shape implements AreaMeasurable, VolumeMeasurable {
    private HashMap<String, Double> coordinates = new HashMap<>();
    private Double width;
    private Double height;

    public SquarePyramid(double x1, double x2, double width, double height) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round(2 * width * (width / (2 + sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2)))) * 100.0) / 100.0;
    }

    @Override
    public double calculateVolume() {
        return Math.round((Math.pow(width, 2) * height) / 3 * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Square pyramid: area - " + calculateArea() + " cm\u00B2; " + "volume - " + calculateVolume() + " cm\u00B3; " +
                "coordinates - " + coordinates + "; " + "width - " + width + " cm; " + "height - " + height + " cm;";
    }
}
