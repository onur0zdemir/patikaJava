import java.util.Scanner;

public class Calculator {

    static int addition(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
        return result;
    }

    static int subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
        return result;
    }

    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
        return result;
    }

    static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Second number must be different from zero");
            return 0;
        }
        int result = a / b;
        System.out.println("Division: " + result);
        return result;
    }

    static int exponential(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "! = " + result);
    }

    static int modulo(int a, int b) {
        return a % b;
    }

    static void rectangular(int a, int b) {
        System.out.println("Area: " + (a * b));
        System.out.println("Perimeter: " + (2 * (a + b)));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Number\n"
                + "6- Factorial\n"
                + "7- Modulo\n"
                + "8- Rectangular Area and Perimeter\n"
                + "0- Exit";

        System.out.println(menu);
        while (true) {
            System.out.print("Choose: ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("First Number: ");
            int a = scan.nextInt();
            System.out.print("Second Number: ");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    subtraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    System.out.println("Exponential: " + exponential(a, b));
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    System.out.println("Modulo: " + modulo(a, b));
                    break;
                case 8:
                    rectangular(a, b);
                    break;
                default:
                    System.out.println("Wrong!");
            }
        }
        System.out.println("Exited!");
    }
}