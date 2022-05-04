import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, number, count = 0, sum = 0, avg;
        System.out.print("Number: ");
        number = input.nextInt();

        while (i <= number) {
            i++;
            if (i % 12 == 0) {
                count++;
                sum += i;
            }
        }
        avg = sum / count;
        System.out.println("The average of the numbers exactly divided by 3 and 4 is: " + avg);
    }
}