package ua.in.dergachovda.less04;

public class DecToBin {
    public static void main(String[] args) {
        int n = 15;
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println(bin);
    }
}
