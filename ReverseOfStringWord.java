import java.util.Arrays;

public class ReverseOfStringWord {
    public static void main(String[] args) {
        String str = "Shubham Kumar is a good boy";
        String[] words = str.trim().split(" ");
        int length = words.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = words[i];
            words[i] = words[length - i - 1];
            words[length - i - 1] = temp;
        }
        String reversedSentence = String.join(" ", words);
        System.out.println(reversedSentence);
    }
}
