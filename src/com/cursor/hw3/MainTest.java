package com.cursor.hw3;

import com.cursor.hw3.allclasses.Car;
import com.cursor.hw3.allclasses.Circle;
import com.cursor.hw3.allclasses.NumberOfObjects;

public class MainTest {
    public static void main(String[] args) {
        new Circle(7).calculationCircleArea();

        new NumberOfObjects().countsObjects();

        Car someCar = new Car();
        someCar.startEngine();
        someCar.go();
        someCar.keepSpeed(100);
        someCar.countsCarObjects();
    }
}
