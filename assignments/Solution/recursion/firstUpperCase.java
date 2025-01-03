public class firstUpperCase {
    public static char first( String str ) {
        for (int i = 0; i < str.length(); i++) {
            if ( Character.isUpperCase(str.charAt(i))) {
                return str.charAt(i);
            }
        }
         return 0;   
        
    }
    public static void main(String[] args) {
        String str = "geeks For geekS";
        char s=first(str);
        if (s==0){
            System.out.println("No uppercase");
        }
        else{
            System.out.println(s);
        }
    }
    
}
