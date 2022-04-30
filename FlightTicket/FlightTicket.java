import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        int km, age, ticketType, price;
        double pricePerKM = 0.1;

        Scanner input = new Scanner(System.in);

        System.out.print("KM: ");
        km = input.nextInt();

        if (km < 1) {
            System.out.print("KM must be bigger than zero");

        } else {
            System.out.print("Age: ");
            age = input.nextInt();

            if (age < 1) {
                System.out.println("Age must be bigger than zero");

            } else {
                price = (int) (km * pricePerKM);

                if (age < 12) price -= price * 0.5;
                else if (age < 24) price -= price * 0.1;
                else if (age < 65) price = (int) (km * pricePerKM);
                else price = (int) (price * 0.7);

                System.out.println("Select trip type\n1: One-Way\n2: Round");

                ticketType = input.nextInt();
                if (ticketType == 1 || ticketType == 2) {
                    switch (ticketType) {
                        case 1:
                            break;
                        case 2:
                            price -= price * 0.2;
                            price *= 2;
                            break;
                    }
                    System.out.println("Total Price: " + price + " TL");
                } else {
                    System.out.println("Wrong, try again (1 or 2)");
                }
            }
        }
    }
}