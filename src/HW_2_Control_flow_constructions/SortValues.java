package HW_2_Control_flow_constructions;

import java.util.Arrays;
import java.util.Collections;

class SortValues {
    Integer[] array = {2, 3, 1, 7, 11};

    public void reverseSort() {
        Arrays.sort(array, Collections.reverseOrder());

        System.out.print("Sort values by DESC: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}