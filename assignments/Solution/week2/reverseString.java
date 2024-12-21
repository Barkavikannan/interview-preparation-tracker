import java.util.Arrays;

public class reverseString {
    public static void reverse ( char[] s)
        {
            int i = 0;
            int j = s.length - 1;
            while(i <= j){
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
                
                }
                public static void main(String[] args) {
                    char[] string= {'h','e','l','l','o'};
                    reverse(string);
                System.out.println(Arrays.toString(string));
    }
}

