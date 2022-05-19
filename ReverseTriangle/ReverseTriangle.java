import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("N: ");
        n = scanner.nextInt();

        for (int x = n; x >= 1; x--) {
            for (int y = (n - x); y >= 1; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}