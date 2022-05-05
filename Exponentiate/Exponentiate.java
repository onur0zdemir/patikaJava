import java.util.Scanner;

public class Exponentiate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number;
        System.out.print("Boundary value: ");
        number = scn.nextInt();

        System.out.println("\nThe multiples of 4 up to " + number);
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("\nThe multiples of 5 up to " + number);
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}