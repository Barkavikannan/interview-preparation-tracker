import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class concatenatedWord {
    HashMap<String, Boolean> map = new HashMap<>();
    
    public int dyfindword(int n, String base, Integer[] dp){
        if(n == base.length()) return 0;
        if(dp[n] != null) return dp[n];
        
        @SuppressWarnings("unused")
        int ans = -1;
        for(int i=n+1; i<=base.length(); i++){
            String sb = base.substring(n, i);
            if(!map.containsKey(sb)) continue;
 
            int further = dyfindword(i, base, dp);
            if(further > -1) return dp[n] = 1 + further;
        }
        
        return dp[n] = -1;
    }
    
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for(String s : words){
            map.put(s, true);
        }
        
        List<String> ans = new ArrayList<>();
        
        for(String word : words){
            Integer[] dp = new Integer[word.length()+1];
            if(dyfindword(0, word, dp) > 1) ans.add(word);
        }
       
        return ans;
    }
    public static void main(String[] args) {
        String [] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippop"};
        System.out.println( new concatenatedWord().findAllConcatenatedWordsInADict(words));
    }
}
    

