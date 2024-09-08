import java.util.Arrays;

public class removeSpecificElementFromArray {
    public static void main(String [] args)
    {
        int [] arr = {10, 30, 25, 30, 10, 45, 76, 30};
        int l = 0;
        int num = 40;
        int count = 0;
        for(int c: arr)
            l++;
        for (int c: arr)
            if(c == num)
                count++;
        int j = 0;
        int [] temp = new int[l - count];
        for(int c: arr)
            if(c != num)
                temp[j++] = c;
        System.out.println(Arrays.toString(temp));
    }
}
