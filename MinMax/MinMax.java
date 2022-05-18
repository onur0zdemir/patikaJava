import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, num, min = 0, max = 0;

        System.out.print("How many numbers: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". number: ");
            num = sc.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}