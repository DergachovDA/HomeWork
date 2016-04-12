package ua.in.dergachovda;

public class Calc {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        char operation = args[1].charAt(0);
        int b = Integer.parseInt(args[2]);
        String result;

        switch (operation) {
            case '+':
                result = a + " + " + b + " = " + (a + b);
                break;
            case '-':
                result = a + " - " + b + " = " + (a - b);
                break;
            case '*':
                result = a + " * " + b + " = " + ((long)a * b);
                break;
            case '/':
                result = a + " / " + b + " = " + ((float)a / b);
                break;
            default:
                result = "error";
        }

        System.out.println(result);

    }

}
