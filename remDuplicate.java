import java.util.HashMap;
import java.util.HashSet;

public class remDuplicate {
    public static void main(String[] args)
    {
        int [] arr = {20, 24, 33, 20, 45, 33};
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i: arr)
        {
            if(hs.containsKey(i))
                hs.put(i, hs.get(i)+1);
            else
                hs.put(i, 1);
        }
        System.out.println(hs);

//        if(hs.get() > 1)
    }
}
