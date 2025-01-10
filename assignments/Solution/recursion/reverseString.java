public class reverseString {
    public static void rev( char[] str, int i, int j) {
    
            if( i>= j)
            return  ;
    
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
    
            rev( str , i+1 , j-1 );
    }

    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        int i=0;
        int j=str.length-1;
        rev(str, i, j);
        System.out.println( "Original String: " + String.valueOf(str) );
    }
}