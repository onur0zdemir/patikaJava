import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar, toplamTutar;

        System.out.print("Armut kg: ");
        armutKg = input.nextDouble();
        armutTutar = armut * armutKg;

        System.out.print("Elma kg: ");
        elmaKg = input.nextDouble();
        elmaTutar = elma * elmaKg;

        System.out.print("Domates kg: ");
        domatesKg = input.nextDouble();
        domatesTutar = domates * domatesKg;

        System.out.print("Muz kg: ");
        muzKg = input.nextDouble();
        muzTutar = muz * muzKg;

        System.out.print("Patlıcan kg: ");
        patlicanKg = input.nextDouble();
        patlicanTutar = patlican * patlicanKg;

        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");


    }
}
