package hw3.allClasses;

public class Car {
    int speed;
    boolean engineIsOn;
    static int count;

    public Car() {
        count++;
    }

    public void startEngine(boolean engineIsOn) {
        this.engineIsOn = engineIsOn;
        if (engineIsOn) {
            System.out.println("You started the engine!");
        } else {
            System.out.println("You turned off the engine!");
        }
    }

    public void go() {
        System.out.println("You just go.");
    }

    public void keepSpeed(int speed) {
        this.speed = speed;
        System.out.println("You drive at a speed " + speed + " km/h");
    }

    public void countsCarObjects() {
        System.out.println("There are: " + count + " Car objects.");
    }

    public void justGo(){
        startEngine(true);
        go();
        keepSpeed(100);
        countsCarObjects();
    }
}
