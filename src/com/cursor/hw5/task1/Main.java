package com.cursor.hw5.task1;

public class Main {
    static MyList<Integer> myList = new MyList<>();
    private static MaxAndMinValues max = new MaxAndMinValues();
    private static MaxAndMinValues min = new MaxAndMinValues();

    public static void main(String[] args) {
        myList.add(20);
        myList.add(120);
        myList.add(220);
        myList.add(-20);
        myList.add(-200);
        myList.add(-10);

        System.out.println(myList.getListOfArguments());


        max.largest();
        min.smallest();
    }
}
