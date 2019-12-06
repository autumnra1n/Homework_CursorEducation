package hw3.allclasses;

public class Car {
    private static int count;
    private boolean engineIsOn;

    public Car() {
        count++;
    }

    public void startEngine() {
        if (this.engineIsOn) {
            System.out.println("You started the engine!");
        } else {
            System.out.println("You turned off the engine!");
        }
    }

    public void go() {
        System.out.println("You just go.");
    }

    public void keepSpeed(int speed) {
        System.out.println("You drive at a speed " + speed + " km/h");
    }

    public void countsCarObjects() {
        System.out.println("There are: " + count + " Car objects.");
    }
}
