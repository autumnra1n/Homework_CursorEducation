package HW_2_Control_flow_constructions;

class ArithmeticMean {
    int[] array = {10, 224, 300, 128, 4};

    public void returnArithmeticalMean() {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / array.length;

        System.out.println("Arithmetic mean of this array: " + sum);
    }
}
