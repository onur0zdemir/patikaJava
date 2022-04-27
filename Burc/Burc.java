import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Which Month? ");
        month = input.nextInt();

        if (month <= 12 && month >= 1) {

            System.out.print("Which Day? ");
            day = input.nextInt();

            if ((month == 1)) {
                if (day > 0 && day < 22)
                    System.out.println("Capricorn");
                else if (day >= 22 && day <= 31)
                    System.out.println("Aquarius");
                else
                    System.out.println("Day must be 1-31");
            }
            if ((month == 2)) {
                if (day > 0 && day < 20)
                    System.out.println("Aquarius");
                else if (day >= 20 && day <= 29)
                    System.out.println("Pisces");
                else
                    System.out.println("Day must be 1-29");
            }
            if ((month == 3)) {
                if (day > 0 && day < 21)
                    System.out.println("Pisces");
                else if (day >= 21 && day <= 31)
                    System.out.println("Aries");
                else
                    System.out.println("Day must be 1-31");
            }
            if ((month == 4)) {
                if (day > 0 && day < 21)
                    System.out.println("Aries");
                else if (day >= 21 && day <= 30)
                    System.out.println("Taurus");
                else
                    System.out.println("Day must be 1-30");
            }
            if ((month == 5)) {
                if (day > 0 && day < 22)
                    System.out.println("Taurus");
                else if (day >= 22 && day <= 31)
                    System.out.println("Gemini");
                else
                    System.out.println("Day must be 1-31");
            }
            if ((month == 6)) {
                if (day > 0 && day < 23)
                    System.out.println("Gemini");
                else if (day >= 23 && day <= 31)
                    System.out.println("Cancer");
                else
                    System.out.println("Day must be 1-30");
            }
            if ((month == 7)) {
                if (day > 0 && day < 23)
                    System.out.println("Cancer");
                else if (day >= 23 && day <= 31)
                    System.out.println("Leo");
                else
                    System.out.println("Day must be 1-31");
            }
            if ((month == 8)) {
                if (day > 0 && day < 23)
                    System.out.println("Leo");
                else if (day >= 23 && day <= 31)
                    System.out.println("Virgo");
                else
                    System.out.println("Day must be 1-31");
            }
            if ((month == 9)) {
                if (day > 0 && day < 23)
                    System.out.println("Virgo");
                else if (day >= 23 && day <= 31)
                    System.out.println("Libra");
                else
                    System.out.println("Day must be 1-30");
            }
            if ((month == 10)) {
                if (day > 0 && day < 23)
                    System.out.println("Libra");
                else if (day >= 23 && day <= 31)
                    System.out.println("Scorpio");
                else
                    System.out.println("Day must be 1-31");
            }
            if ((month == 11)) {
                if (day > 0 && day < 22)
                    System.out.println("Scorpio");
                else if (day >= 22 && day <= 31)
                    System.out.println("Sagittarius");
                else
                    System.out.println("Day must be 1-30");
            }
            if ((month == 12)) {
                if (day > 0 && day < 22)
                    System.out.println("Sagittarius");
                else if (day >= 22 && day <= 31)
                    System.out.println("Capricorn");
                else
                    System.out.println("Day must be 1-31");
            }
        } else {
            System.out.println("Month must be 1-12!");
        }
    }
}