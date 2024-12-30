public class subset {
    public static void main(String[] args) {
    String s = "abc";
    subSetPrint(s);
    }

    public static void subSetPrint( String s){
        helperPrint("",s);
    }

    public static void helperPrint(String processed, String unprocessed){
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
            
        }

        char ch = unprocessed.charAt(0);
        //take it
        helperPrint(processed + ch, unprocessed.substring(1));
//leave it
        helperPrint(processed, unprocessed.substring(1));
    }
    
}
