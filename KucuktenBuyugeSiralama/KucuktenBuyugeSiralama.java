import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {

        int firstNumber, secondNumber, thirdNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        firstNumber = input.nextInt();
        System.out.print("Second Number: ");
        secondNumber = input.nextInt();
        System.out.print("Third Number: ");
        thirdNumber = input.nextInt();

        if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
            if (secondNumber < thirdNumber)
                System.out.println("First Number < Second Number < Third Number");
            else if (secondNumber == thirdNumber)
                System.out.println("First Number < Second Number = Third Number");
            else
                System.out.println("First Number < Third Number < Second Number");

        } else if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
            if (firstNumber < thirdNumber)
                System.out.println("Second Number < First Number < Third Number");
            else if (firstNumber == thirdNumber)
                System.out.println("Second Number < First Number = Third Number");
            else
                System.out.println("Second Number < Third Number < First Number");

        } else if ((thirdNumber < firstNumber) && (thirdNumber < secondNumber)) {
            if (firstNumber < secondNumber)
                System.out.println("Third Number < First Number < Second Number");
            else if (firstNumber == secondNumber)
                System.out.println("Third Number < First Number = Second Number");
            else
                System.out.println("Third Number < Second Number < First Number");

        } else if ((firstNumber == secondNumber) && firstNumber < thirdNumber) {
            System.out.println("First Number = Second Number < Third Number");

        } else if ((secondNumber == thirdNumber) && secondNumber < firstNumber) {
            System.out.println("First Number < Second Number = Third Number");

        } else if (firstNumber < secondNumber) {
            System.out.println("First Number = Third Number < Second Number");

        } else {
            System.out.println("First Number = Second Number = Third Number");
        }
    }
}

