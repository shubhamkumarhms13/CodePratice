import java.util.Arrays;

class SumOfTwoNumber {
    public static int[] returnSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] a = {i, j};
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 13, 18};
        int target = 5;
        int[] result = SumOfTwoNumber.returnSum(nums, target);
        if (result != null)
            System.out.println(Arrays.toString(result));
        else
            System.out.println("No record found");
    }
}
