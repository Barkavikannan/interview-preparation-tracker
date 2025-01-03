//package interview-preparation-tracker.assignments.Solution.recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetList {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subSetPrint(s));

        }
    
        public static List<String>subSetPrint( String s){
            List<String> result = helperPrint("",s);
            return result;
        }
    
        public static List<String> helperPrint(String processed, String unprocessed){
            if (unprocessed.isEmpty()) {
                List<String> result = new ArrayList<>();
                result.add(processed);
                return result;
                
            }
    
            char ch = unprocessed.charAt(0);
            //take it
            List<String> result = new ArrayList<>();
            result.addAll(helperPrint(processed + ch, unprocessed.substring(1)));
    //leave it
            result.addAll(helperPrint(processed, unprocessed.substring(1)));
            return result;
        }
        
    
}
