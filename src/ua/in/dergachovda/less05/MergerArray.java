package ua.in.dergachovda.less05;

import ua.in.dergachovda.Utils;

public class MergerArray {

    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        int[] c = mergerArray(a, b);
        Utils.printArray(c);

    }

    public static int[] mergerArray (int[] a, int[] b) {
        int[] resultArray = new int[a.length + b.length];
        for (int i = 0; i < resultArray.length; i++)
            resultArray[i] = i < a.length ? a[i] : b[i - a.length];
        return Utils.arraySort(resultArray);
    }

}
