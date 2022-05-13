import java.util.Scanner;

public class Harmonics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 + (1 / 2) + ... + (1 / n)");
        System.out.print("n: ");
        int n = input.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println("Result = " + result);
    }
}