public class HarmonicMean {
    public static void main(String[] args) {

        int[] list = {4, 8, 15, 16, 23, 42};

        double sum = 0;
        for (double i : list) {
            sum += 1 / i;
        }
        double average = list.length / sum;
        System.out.println("Harmonic Mean\n" + average);
    }
}