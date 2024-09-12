import java.util.Arrays;

class MaxAndMinInArray
{
    public static void main(String[] args) {
        int [] arr = {10, 30, 25, 5, 18, 63, 45, 87, 76};
        int minValue, maxValue;
        int l = arr.length;
        minValue = arr[0];
        maxValue = arr[0];
        for(int i = 0; i < l; i++)
        {
            if(minValue > arr[i])
                minValue = arr[i];
            else if (maxValue < arr[i])
                maxValue = arr[i];
        }
        System.out.println(minValue);
        System.out.println(maxValue);
    }
}