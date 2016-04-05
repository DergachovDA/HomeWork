package ua.in.dergachovda;

public class Utils {

    public static void printArray(int[] array) {
        System.out.println("Array: ");
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("}");
    }

    public static int[] arraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[indexMin])
                    indexMin = j;
            int temp = a[i];
            a[i] = a[indexMin];
            a[indexMin] = temp;
        }
        return a;
    }

}
