package hw3;

public class MainTest {
    public static void main(String[] args) {
        new Circle(7).calculationCircleArea();

        new NumberOfObjects().countsObjects();

        new Car().startEngine(true);
        new Car().go();
        new Car().keepSpeed(100);
        new Car().countsCarObjects();
    }
}
