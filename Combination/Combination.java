import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner combination = new Scanner(System.in);

        int n, r, t, nFactorial = 1, rFactorial = 1, tFactorial = 1, result;

        System.out.println("C(n,r) = n! / (r! * (n - r)!)");
        System.out.print("n: ");
        n = combination.nextInt();
        System.out.print("r: ");
        r = combination.nextInt();

        t = (n - r);

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFactorial *= j;
        }
        for (int k = 1; k <= t; k++) {
            tFactorial *= k;
        }

        result = nFactorial / ((rFactorial) * tFactorial);

        System.out.println("C(" + n + "," + r + ")" + " = " + n + "! / (" + r + "!" + " * " + "(" + n + " - " + r + ")!)");
        System.out.println("C(" + n + "," + r + ")" + " = " + result);
    }
}
