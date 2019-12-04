package hw3;

public class Circle {
   private int radius;
    public void calculationCircleArea(){
        int s = (int) (Math.PI * Math.pow(radius, 2));
        System.out.println("Circle area is: " + s + " cm2");
    }
    public Circle(int radius){
        this.radius = radius;
    }
}
