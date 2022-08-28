import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the array: ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". Element: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorting: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
