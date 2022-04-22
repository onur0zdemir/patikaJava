import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Mat notu: ");
        mat = input.nextInt();

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();

        System.out.print("Tarih notu: ");
        tarih = input.nextInt();

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();

        int notlarinToplami = (mat + fizik + kimya + turkce + tarih + muzik);
        double notlarinOrtalamasi = notlarinToplami / 6;
        System.out.println("Notlarýn Ortalamasý: " + notlarinOrtalamasi);

        String gectiKaldi = (notlarinOrtalamasi > 60) ? "Geçti" : "Kaldý";
        System.out.println(gectiKaldi);


    }
}
