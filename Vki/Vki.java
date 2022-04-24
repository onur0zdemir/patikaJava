import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {

        double m, kg;

        Scanner input = new Scanner(System.in);

        System.out.print("Boy: ");
        m = input.nextDouble();

        System.out.print("Kilo: ");
        kg = input.nextDouble();

        System.out.print("VKİ: " + (kg / (m * m)));
    }
}
