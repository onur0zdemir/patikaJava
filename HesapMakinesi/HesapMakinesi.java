import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int numberOne, numberTwo, select;

        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        numberOne = input.nextInt();
        System.out.print("Second Number: ");
        numberTwo = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Select: ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.print("Addition: " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.print("Subtraction: " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.print("Multiplication: " + (numberOne * numberTwo));
                break;
            case 4:
                if (numberTwo == 0)
                {
                    System.out.println("The number cannot be divided by zero");
                }
                else
                {
                    System.out.print("Division: " + (numberOne / numberTwo));
                }
                break;
            default:
                System.out.print("Try Again");
                break;

        }

    }
}
