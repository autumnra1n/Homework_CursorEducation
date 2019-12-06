package hw3;

public class Circle {
    private double radius;

    public void calculationCircleArea() {
        double s = (Math.PI * Math.pow(radius, 2));
        System.out.println("Circle area is: " + s + " cm2");
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
