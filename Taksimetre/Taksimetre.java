import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km, startPrice = 10;
        double perKm = 2.2, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe: ");
        km = input.nextInt();

        total = startPrice + (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar: " + total);

    }
}
