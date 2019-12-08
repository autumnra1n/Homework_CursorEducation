package com.cursor.hw4.task1.planeshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.PerimeterMeasurable;

import java.awt.geom.Point2D;
import java.util.HashMap;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private HashMap<String, Double> coordinates = new HashMap<>();

    private Double perimeter;
    private Double area;
    private double c1;
    private double c2;
    private double c3;
    private double p;


    public Triangle(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.coordinates.put("y1", y1);
        this.coordinates.put("y2", y2);
        this.coordinates.put("z1", z1);
        this.coordinates.put("z2", z2);

        c1 = Point2D.distance(x1, x2, y1, y2);

        c2 = Point2D.distance(y1, y2, z1, z2);

        c3 = Point2D.distance(x1, x2, z1, z2);

        p = (c1 + c2 + c3) / 2;
        area = Math.sqrt(p * (p - c1) * (p - c2) * (p - c3));
        area = Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round((c1 + c2 + c3) * 100.0) / 100.0;
    }

    @Override
    public double getArea() {
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public String toString() {

        return "Triangle: area - " + getArea() + " cm; " + "perimeter - " + getPerimeter() + " cm2; " + "coordinates - " +
                coordinates + "; " + "first side - " + Math.round(c1 * 100.0) / 100.0 + "cm; " + "second side - " +
                Math.round(c2 * 100.0) / 100.0 + "cm; " + "third side - " + Math.round(c3 * 100.0) / 100.0 + "cm;";
    }
}
