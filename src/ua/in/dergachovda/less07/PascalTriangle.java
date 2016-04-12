package ua.in.dergachovda.less07;

public class PascalTriangle {

    public static void main(String[] args) {

        int n = 6;
        int[][] t = new int[n][];

        for (int i = 0; i < t.length; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0)
                    t[i][j] = 1;
                else
                    t[i][j] = (j == 0 ? 0 : t[i - 1][j - 1]) + (j >= t[i - 1].length ? 0 : t[i - 1][j]);
            }
        }
        printTriangle(t);
    }

    public static void printTriangle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int tab = array.length - 1; tab > i; tab--)
                System.out.print("\t");
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "\t\t");
            System.out.print("\n\n");
        }
    }

}
