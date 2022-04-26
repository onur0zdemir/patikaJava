import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;
        double total = 0, average;

        Scanner input = new Scanner(System.in);

        System.out.print("Math score: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
        }

        System.out.print("Physics score: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
        }

        System.out.print("Turkish score: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
        }

        System.out.print("Chemistry score: ");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
        }

        System.out.print("Music score: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
        }

        average = total / 5;


        if (average < 55) {
            System.out.println("Failed!");
        } else {
            System.out.println("Passed.");
        }
        System.out.println("Average: " + average);

    }
}
