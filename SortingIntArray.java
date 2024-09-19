import java.util.Arrays;

public class SortingIntArray {
    public static void main(String[] args) {
        int[] arr = {17, 3 , 14 , 2 , 11, 7, 5};
        int l = arr.length;
        int temp;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
