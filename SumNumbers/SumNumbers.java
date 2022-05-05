import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        int number, total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Number: ");
            number = scan.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("The sum of the numbers that are multiples of 4 is: " + total);
    }
}
