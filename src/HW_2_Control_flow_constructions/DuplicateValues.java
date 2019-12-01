package HW_2_Control_flow_constructions;

class DuplicateValues {
    static Integer[] array = {3, 2, 3, 1, 4, 2, 8, 3};
    static int i;
    static int x;

    public void replaceDuplicatedValues() {
        System.out.print("Result: ");

        for (i = 0; i < array.length; i++) {
            comparisonOperation();
            System.out.print(array[i] + " ");
        }
    }

    public static void comparisonOperation() {
        for (x = 1 + i; x < array.length; x++) {
            if (array[i].equals(array[x])) {
                array[x] = 0;
            }
        }
    }
}
