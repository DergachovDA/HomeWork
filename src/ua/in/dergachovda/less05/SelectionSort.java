package ua.in.dergachovda.less05;

import ua.in.dergachovda.Utils;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array1 = {3, 5, 1, 7, 2, 4, 6, 8, 9, 0};
        int[] array2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] array_Inc_1000 = new int[1000];
        for (int i = 0; i < 1000; i++)
            array_Inc_1000[i] = i;

        int[] array_Dec_1000 = new int[1000];
        for (int i = 0; i < 1000; i++)
            array_Dec_1000[i] = 999 - i;

        Utils.printArray(array1);
        Utils.printArray(selectionSort(array1));
        System.out.println();

        Utils.printArray(array2);
        Utils.printArray(selectionSort(array2));
        System.out.println();

        Utils.printArray(array_Inc_1000);
        Utils.printArray(selectionSort(array_Inc_1000));
        System.out.println();

        Utils.printArray(array_Dec_1000);
        Utils.printArray(selectionSort(array_Dec_1000));
        System.out.println();
    }

    public static int[] selectionSort(int[] a) {

        int operation = 0;
        long start = System.nanoTime();

        for (int i = 0; i < a.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                    operation++;
                }
            }
            if (i != indexMin) {
                int temp = a[i];
                a[i] = a[indexMin];
                a[indexMin] = temp;
                operation++;
            }
        }

        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Selection sort duration is: " + duration + " ns");
        System.out.println("Operation is " + operation);
        System.out.println("Array length: " + a.length);

        return a;
    }
}
