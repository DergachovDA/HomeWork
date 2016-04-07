package ua.in.dergachovda.coaching;
import ua.in.dergachovda.Utils;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arrry = new int[10];
        for (int i = 0; i < arrry.length; i++)
            arrry[i] = random.nextInt(100);
        Utils.printArray(arrry);

        int[] sortArray = Arrays.copyOf(arrry, arrry.length);
        Utils.arraySort(sortArray);
        Utils.printArray(sortArray);
    }

}
