import java.util.Arrays;

public class SubsequentEntrySorting {
    public static int largestDifference(int[] A) {
        if (A.length < 2) {
            System.out.println("Sorted Array: " + Arrays.toString(A));
            return 0;
        }

        int l = A.length;
        int temp;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(A));

        int maxDiff = 0;
        for (int i = 1; i < l; i++) {
            int diff = A[i] - A[i - 1];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] A = {17};
        int result = largestDifference(A);
        System.out.println("Largest Difference between two subsequent entries is: " + result);
    }
}