package oop2.Task11;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int index = 0;
        for (String element : array) {
            if (element != null) {
                array[index++] = element;
            }
        }
        while (index < array.length) {
            array[index++] = null;
        }
    }
}
