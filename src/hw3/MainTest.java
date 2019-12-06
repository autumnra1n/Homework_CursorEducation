package hw3;

import hw3.allClasses.Car;
import hw3.allClasses.Circle;
import hw3.allClasses.NumberOfObjects;

public class MainTest {
    public static void main(String[] args) {
        new Circle(7).calculationCircleArea();

        new NumberOfObjects().countsObjects();

        Car someCar = new Car();
        someCar.startEngine(true);
        someCar.go();
        someCar.keepSpeed(100);
        someCar.countsCarObjects();
    }
}
