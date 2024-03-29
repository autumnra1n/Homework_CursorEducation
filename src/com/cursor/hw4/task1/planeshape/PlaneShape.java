package com.cursor.hw4.task1.planeshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.PerimeterMeasurable;
import com.cursor.hw4.task1.interfaces.Shape;

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double halfPerimeter;
}
