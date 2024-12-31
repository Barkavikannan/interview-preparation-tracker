import java.util.ArrayList;
import java.util.List;

public class arrayToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = k;

        for (int i = num.length - 1; i >= 0; i--) {
            carry += num[i];            
            result.add(0, carry % 10);  
            carry /= 10;                
        }

        while (carry > 0) {
            result.add(0, carry % 10);  
            carry /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println("The final answer is " + result);
    }
}
