public class DuplicatesInArray {
    public static void main(String[] args) {
        String [] arr = {"java", "C", "C++", "Python", "C00++", "Java"};
        boolean flag = false;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicates elements are: " + arr[i]);
                    flag = true;
                }
            }
        }
        if(flag == false)
            System.out.println("No Duplicates elements available");
    }
}
