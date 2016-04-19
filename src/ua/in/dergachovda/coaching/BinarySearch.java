package ua.in.dergachovda.coaching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int n = 0;
        if (binarySearch(array, n))
            System.out.println(n  + " is in this array.");
        else
            System.out.println(n + " isn't in this array.");
    }

    public static boolean binarySearch(int[] a, int n) {
        int mid, low, high;
        low = 0;
        high = a.length;
        while (low < high) {
            mid = low + ((high - low) >> 1);
            if (n == a[mid]) {
                return  true;
            }
            if (n > a[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return false;
    }

}
