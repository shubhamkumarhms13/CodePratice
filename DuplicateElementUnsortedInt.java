import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementUnsortedInt {
    public static void main(String[] args) {
        int [] arr = {10, 40, 50, 30, 40, 60, 75, 50};
        HashSet<Integer> hs = new HashSet<Integer>();
        int l = arr.length;
        for (int i = 0; i < l; i++)
        {
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
