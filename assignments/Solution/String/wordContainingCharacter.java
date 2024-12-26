import java.util.ArrayList;
import java.util.List;

public class wordContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i);
                }
            }
            return result;

    }
    
    public static void main(String[] args) {
       String[] words = {"leet","code"};
       char x = 'e';
       List<Integer> result = findWordsContaining(words, x);
       System.out.println(result);


    }
    
}
