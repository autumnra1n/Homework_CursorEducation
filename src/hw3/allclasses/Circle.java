package hw3.allclasses;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculationCircleArea() {
        double s = (Math.PI * Math.pow(radius, 2));
        s = Math.round(s * 100.0) / 100.0;
        System.out.println("Circle area is: " + s + " cm2");
    }
}
