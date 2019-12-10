package com.cursor.hw4.task1.planeshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.PerimeterMeasurable;

import java.awt.geom.Point2D;
import java.util.HashMap;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private HashMap<String, Double> coordinates = new HashMap<>();

    public Triangle(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.coordinates.put("x1", x1);
        this.coordinates.put("x2", x2);
        this.coordinates.put("y1", y1);
        this.coordinates.put("y2", y2);
        this.coordinates.put("z1", z1);
        this.coordinates.put("z2", z2);

        side1 = Point2D.distance(x1, y1, x2, y2);

        side2 = Point2D.distance(x1, y2, z1, z2);

        side3 = Point2D.distance(x1, y2, z1, z2);

        halfPerimeter = (side1 + side2 + side3) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        area = Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round((side1 + side2 + side3) * 100.0) / 100.0;
    }

    @Override
    public double calculateArea() {
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public String toString() {

        return "Triangle: area - " + calculateArea() + " cm\u00B2; " + "perimeter - " + calculatePerimeter() + " cm; " + "coordinates - " +
                coordinates + "; " + "first side - " + Math.round(side1 * 100.0) / 100.0 + " cm; " + "second side - " +
                Math.round(side2 * 100.0) / 100.0 + " cm; " + "third side - " + Math.round(side3 * 100.0) / 100.0 + " cm;";
    }
}
