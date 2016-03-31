package ua.in.dergachovda.less04;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println(bin);
    }
}
