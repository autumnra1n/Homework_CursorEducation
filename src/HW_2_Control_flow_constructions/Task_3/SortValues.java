package HW_2_Control_flow_constructions.Task_3;

import java.util.Arrays;
import java.util.Collections;

public class SortValues {
    static Integer[] array = {2, 3, 1, 7, 11};

    public static void main(String[] args) {
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}