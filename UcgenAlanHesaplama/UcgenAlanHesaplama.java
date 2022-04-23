import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        double u, alan;

        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();
        System.out.print("3. Kenar: ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
