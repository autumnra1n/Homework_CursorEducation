package hw3;

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
