import java.util.ArrayList;
import java.util.List;

public class letterCompinationOfPhnNum {
    public static List<String> letterCombinations(String digits) {
         ArrayList<String> list = new ArrayList<>();
       if(digits.isEmpty())
       return list;
       return pad( "",digits); 
           }
    public static List<String> pad(String p , String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0)-'0';
          ArrayList<String> list = new ArrayList<>();
          int i =(digits-2)*3;
          if(digits>7)i+=1;
          int len= i+3;
          if(digits ==7 || digits == 9) len+=1;
          for( ;i< len ; i++){
            char ch = (char) ('a'+ i);
           list.addAll( pad(p + ch , up.substring(1)));
          }
          return list;
        }
        public static void main(String[] args) {
            String digits = "23";
            System.out.println( letterCombinations(digits));
        }
    
}
