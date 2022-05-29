import java.util.Scanner;

public class Palindrome {

    static boolean isPalindorme(int number) {
        int temp = number, reverseNumber = 0, lastNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        boolean isPalindrome = (reverseNumber == number) ? true : false;
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        String result = isPalindorme(number) ? +number + " is a palindrome" : +number + " is not a palindrome";
        System.out.println(result);
    }
}