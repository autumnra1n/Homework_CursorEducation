package HW_2_Control_flow_constructions;

class DuplicateValues {
    int[] array = {3, 2, 3, 1, 4, 2, 8, 3};

    public void replaceDuplicatedValues() {
        System.out.print("Result: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 || array[i] == 2) {
                if (i != 0 && i != 1) {
                    array[i] = 0;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
