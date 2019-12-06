package hw3.allclasses;

public class NumberOfObjects {
    public static int count;

    public NumberOfObjects() {
        count++;
    }

    public void countsObjects() {
        System.out.println("It was created " + count + " object/s in this class.");
    }
}
