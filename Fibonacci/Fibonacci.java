import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, first = 0, second = 1, sum;

        System.out.print("N: ");
        n = scanner.nextInt();
        System.out.print(n + " Element Fibonacci Series: " + first + " " + second + " ");
        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
        }
    }
}