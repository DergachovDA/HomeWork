package ua.in.dergachovda.less10.flashlight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Flashlight flashlight = new Flashlight();
        flashlight.printStateFlashlight();

        while (true) {

            String operation = scanner.next();

            switch (operation) {
                case "off":

                    break;
                case "white":

                    break;
                case "red":

                    break;
                case "blinks":

                    break;
                case "setB":

                    break;
                case "getB":

                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Error!");
            }

            flashlight.printStateFlashlight();
        }

    }

}
