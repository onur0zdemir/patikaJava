import java.util.Arrays;

public class FrequencyNumbersArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int frequencyArr[] = new int[arr.length];
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Number of repetitions: ");

        for (int i = 0; i < arr.length; i++) {
            frequencyArr[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequencyArr[i]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (frequencyArr[i] > 1) {
                if (arr[i] != 0) {
                    System.out.println("The number " + arr[i] + " repeated " + frequencyArr[i] + " times.");
                }
            } else if (frequencyArr[i] == 1) {
                if (arr[i] != 0) {
                    System.out.println("The number " + arr[i] + " repeated " + frequencyArr[i] + " times.");
                }
            }
        }
    }
}
