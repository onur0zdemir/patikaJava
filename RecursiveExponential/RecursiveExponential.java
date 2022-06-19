import java.util.Scanner;

public class RecursiveExponential {
    static int recursiveExponential(int base, int exponential) {
        if (exponential == 0) {
            return 1;
        }
        return base * recursiveExponential(base, exponential - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Base Number: ");
            int base = sc.nextInt();
            System.out.print("Exponential Number: ");
            int exponential = sc.nextInt();
            System.out.println("Result: " + recursiveExponential(base, exponential));
        }
    }
}