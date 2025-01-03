public class permutation {
    public static void permut( String s){
        helpPrint("",s);
    } 

    public static void helpPrint( String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        for(int i=0; i<=processed.length(); i++){
            String newProcessed = processed.substring(0, i)+ch+ processed.substring(i);
            helpPrint(newProcessed,  unprocessed.substring(1));
            
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permut(s);
    }
    
}
