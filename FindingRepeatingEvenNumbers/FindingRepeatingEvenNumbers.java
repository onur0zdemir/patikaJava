public class FindingRepeatingEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Repeating Even Numbers: ");
        int[] list = {4, 8, 4, 15, 16, 23, 8, 15, 42, 23, 4, 8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int value : duplicate) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }
    }
}
