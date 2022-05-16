import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gcd = 1, lcm;

        System.out.print("Small Number: ");
        int n1 = sc.nextInt();
        System.out.print("Big Number: ");
        int n2 = sc.nextInt();

        int i = 1;
        while (i <= n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Greatest Common Divisor: " + gcd);

        lcm = 1;
        while (lcm <= (n1 * n2)) {
            lcm++;
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("Lowest Common Multiple: " + lcm);
                break;
            }
        }
    }
}