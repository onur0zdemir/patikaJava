import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k, result = 1;

        System.out.println("n^k");
        System.out.print("n: ");
        n = scanner.nextInt();
        System.out.print("k: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            result *= n;
        }
        System.out.println(n + "^" + k + " = " + result);
    }
}