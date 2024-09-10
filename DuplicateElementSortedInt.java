import java.util.Arrays;

public class DuplicateElementSortedInt {
    public static void main(String[] args) {
        int[] arr = {10, 30, 25, 5, 18, 76, 63, 45, 87, 76, 25, 45, 90};
        Arrays.sort(arr);
        int l = arr.length;
        int[] temp = new int[l];
        int j = 0;
        for (int i = 0; i < l - 1; i++) {
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }
        temp[j++] = arr[l - 1];
        System.out.println();
        for (int i = 0; i < j; i++)
            System.out.print(temp[i] + " ");
    }
}
