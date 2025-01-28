import java.util.ArrayList;
import java.util.List;


public class wordBreakII {
     public static List<String> wordBreak(String s, List<String> wordDict) {
          List<String> res = new ArrayList<>();
        helper(s, wordDict, res, "");
                return res;
            }
        
            private static void helper(String s, List<String> wordDict, List<String> res, String currString) {
        if (s.isEmpty()) {
            return;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String newCurrString = currString.isEmpty() ? word : currString + " " + word;
                if (s.length() == word.length()) {
                    res.add(newCurrString);
                } else {
                    helper(s.substring(word.length()), wordDict, res, newCurrString);
                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        
        System.out.println( wordBreak(s, wordDict));
    }

 }
