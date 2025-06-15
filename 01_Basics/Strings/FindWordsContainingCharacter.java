import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date"};
        char x = 'a';
        List<Integer> result = findWordsContaining(words, x);
        System.out.println(result); // Output: [0, 1, 3]
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i);
            }
        }
        return result;
    }

}

