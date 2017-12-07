package clock;

import java.util.Scanner;

public class App {
    private static Clock clock = new Clock();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        printMainMenu();
        switch (readInput()) {
            case "1":
                printTime();
                mainMenu();
                break;
            case "2":
                printDegrees();
                mainMenu();
                break;
            case "3":
                setClock();
                mainMenu();
                break;
            case "0":
                System.out.println("Goodbye");
                System.exit(0);
            default:
                System.out.println("Your chosen option does not exist. Please use provided integer numbers for insert");
                mainMenu();
        }
    }

    private static void printMainMenu() {
        System.out.println("Choose action:" +
                "\n 1 - show currently set time" +
                "\n 2 - show angle between main.java.clock arrows" +
                "\n 3 - set time" +
                "\n 0 - quit");
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void setClock() {
        System.out.println("Insert hours:");
        int hours = readTime();
        System.out.println("Insert minutes:");
        int minutes = readTime();
        try {
            clock.setTime(hours, minutes);
        } catch (Exception e) {
            System.out.println("Please use numbers 0 - 23 for hours and 0 - 59 for minutes only");
            System.out.println();
            setClock();
        }
    }

    private static int readTime() {
        try {
            return Integer.parseInt(readInput());
        } catch (NumberFormatException e) {
            System.out.println("Please use integer numbers for insert");
            System.out.println();
            System.out.println("Insert number:");
            return readTime();
        }
    }

    private static void printTime() {
        System.out.format("Currently set time is %02d:%02d \n", clock.getHours(), clock.getMinutes());
        System.out.println();
    }

    private static void printDegrees() {
        System.out.println("Angle between hour and minute arrow is equal to: " + clock.getDegreeBetweenArrows() + "°");
        System.out.println();
    }
}
