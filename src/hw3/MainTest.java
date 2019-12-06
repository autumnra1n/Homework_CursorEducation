package hw3;

import hw3.allclasses.Car;
import hw3.allclasses.Circle;
import hw3.allclasses.NumberOfObjects;

public class MainTest {
    public static void main(String[] args) {
        new Circle(7).calculationCircleArea();

        new NumberOfObjects().countsObjects();

        new Car().justGo();
    }
}
