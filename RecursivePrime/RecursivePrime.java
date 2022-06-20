import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            if (number < 2) {
                System.out.println("Number can not be less than 2!");
            } else {
                String prime = isRecursivePrime(number, 2) ? number + " is prime" : number + " is not prime";
                System.out.println(prime);
            }
        }
    }

    static boolean isRecursivePrime(int number, int index) {
        if (number == index) {
            return true;
        }
        if (number % index == 0) {
            return false;
        }
        return isRecursivePrime(number, index + 1);
    }
}