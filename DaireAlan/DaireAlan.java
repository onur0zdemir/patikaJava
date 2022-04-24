import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        int r;
        double alan, cevre, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapı: ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

    }
}
