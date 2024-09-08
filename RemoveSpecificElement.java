import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int [] arr = {10, 30, 25, 30, 10, 45, 76, 30};
        for(int c: arr)
            System.out.print(c + " ");
        int l = arr.length;
        int [] tarr = new int[l];
        int temp;
        int t;
        int j = 0;
        System.out.print("\nEnter elements to remove: ");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        for(int i = 0; i < l; i++)
        {
            if(arr[i] != temp)
            {
                tarr[j++] = arr[i];
            }
        }
        for(int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (tarr[i] > tarr[k])
                {
                    t = tarr[i];
                    tarr[i] = tarr[k];
                    tarr[k] = t;
                }
            }
        }

        for (int i = 0; i < j; i++)
            System.out.print(Arrays.toString(tarr));
    }
}
