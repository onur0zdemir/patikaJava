import java.util.Scanner;

public class RecursiveAddSubtract {
    static int subtractFive(int number) {
        if (number <= 0)
            return number;
        System.out.print(number + " ");
        return subtractFive(number - 5);
    }
    static int addFive(int temp, int number) {
        if (temp > number)
            return temp;
        System.out.print(temp + " ");
        return addFive(temp + 5, number);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nNumber: ");
            int number = sc.nextInt();
            addFive(subtractFive(number), number);
        }
    }
}