package hw2;

class ArithmeticMean {
    Integer[] array = {10, 224, 300, 128, 4, 1};

    public void determinesArithmeticalMean() {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / array.length;

        sum = Math.round(sum * 100.0) / 100.0;

        System.out.println("Arithmetic mean of this array: " + sum);
    }
}
