
import java.util.Scanner;

public class Cw_9 {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your operation number: 1- add, 2-substract, 3-divide, 4- multiply");
        int answer = Integer.parseInt(scanner.nextLine());

        if (1 == answer) {
            System.out.println("Give Your first number:");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Give Your second number:");
            int second = Integer.parseInt(scanner.nextLine());
            int result = add(first, second);
            System.out.println(result);
        } else if (2 == answer) {
            System.out.println("Give Your first number:");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Give Your second number:");
            int second = Integer.parseInt(scanner.nextLine());
            int result = subtract(first, second);
            System.out.println(result);
        } else if (3 == answer) {
            System.out.println("Give Your first number:");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Give Your second number:");
            int second = Integer.parseInt(scanner.nextLine());
            int result = divide(first, second);
            System.out.println(result);

        } else if (4 == answer) {
            System.out.println("Give Your first number:");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Give Your second number:");
            int second = Integer.parseInt(scanner.nextLine());
            int result = multiply(first, second);
            System.out.println(result);

        } else {
            System.out.println("Give proper answer");
        }
    }

    /*private String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give Your second number:");
        int second = Integer.parseInt(scanner.nextLine());
        return "";
    }

    private int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your operation number:");
        int third = Integer.parseInt(scanner.nextLine());
        return 0;
    } */

    private boolean isMoreThan0(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }

    }

    private static int add(int a, int b) {
        return (a + b);
    }

    private static int subtract(int a, int b) {
        return (a - b);
    }

    private static int divide(int a, int b) {
        return (a / b);
    }

    private static int multiply(int a, int b) {
        return (a * b);
    }

}
