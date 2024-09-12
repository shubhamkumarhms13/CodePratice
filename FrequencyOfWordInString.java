import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordInString {
    public static void main(String[] args) {
        String str = "Shubham Kumar is a good boy Shubham loves to Play cricket is shubham a good boy";
        String [] charArray = str.toLowerCase().split(" ");
        Map<String, Integer> charMap = new HashMap<>();
        for(String c: charArray)
        {
            if(charMap.containsKey(c))
                charMap.put(c, charMap.get(c)+1);
            else
                charMap.put(c, 1);
        }
        System.out.println(charMap);
        for(String ch: charMap.keySet())
        {
            if(charMap.get(ch) > 1)
                System.out.println(ch + ": " + charMap.get(ch));
        }
    }
}
