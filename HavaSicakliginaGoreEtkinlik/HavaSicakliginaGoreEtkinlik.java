import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        String event;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Heat: ");
        heat = input.nextInt();

        event = (heat < 5) ? "Go skiing" : (heat >= 5 && heat < 15) ? "Go to the theater" :
                (heat >= 15 && heat < 25) ? "Go on a picnic" :
                        (heat >= 25) ? "Go swimming" : "";

        System.out.println("Advice: " + event);

    }
}
