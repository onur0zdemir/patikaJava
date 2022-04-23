import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {

        double tutar, yuksekKdvOrani = 0.18, dusukKdvOrani = 0.08;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar: ");
        tutar = input.nextDouble();

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.print("KDV'li Tutar: ");
        System.out.println(tutar > 0 && tutar <= 1000 ? tutar + (tutar * yuksekKdvOrani) + "\nKDV: %18" : tutar + (tutar * dusukKdvOrani) + "\nKDV: %8");

    }
}
