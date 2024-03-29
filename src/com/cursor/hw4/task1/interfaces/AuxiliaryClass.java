package com.cursor.hw4.task1.interfaces;

import com.cursor.hw4.task1.planeshape.Circle;
import com.cursor.hw4.task1.planeshape.Rectangle;
import com.cursor.hw4.task1.planeshape.Triangle;
import com.cursor.hw4.task1.spaceshape.Cuboid;
import com.cursor.hw4.task1.spaceshape.Sphere;
import com.cursor.hw4.task1.spaceshape.SquarePyramid;

public class AuxiliaryClass {
    public void showShapesInfo() {
        Shape[] geometricShapes = {new Circle(1, 2, 20),
                new Rectangle(1, 2, 21.53, 27.09),
                new Triangle(12, 31, 11, 6, 43, 23),
                new SquarePyramid(5, 5, 25, 30),
                new Cuboid(3, 5, 10, 20, 30),
                new Sphere(12, 21, 36.12)};

        for (Shape geometricShape : geometricShapes) {
            System.out.println(geometricShape);
        }
    }
}
