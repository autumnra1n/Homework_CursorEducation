package com.cursor.hw2;

class SumOfNumbers {
    int[] array = {21, 43, -12, 7, -91, -13, 2};

    public void sumOfPositiveNumbers() {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
            if (sum < 0) {
                System.out.println("0");
            }
        }
        System.out.println("Sum of all the positive numbers: " + sum);
    }
}
