import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("N: ");
        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = n - 1; x >= 1; x--) {
            for (int y = (n - x); y >= 1; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}