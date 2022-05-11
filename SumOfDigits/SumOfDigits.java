import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculating the sum of the digits of the number");
        System.out.print("Number: ");
        int number = scanner.nextInt(), result = 0;

        while (number != 0) {
            result += (number % 10);
            number /= 10;
        }
        System.out.println("Sum of digits: " + result);
    }
}
