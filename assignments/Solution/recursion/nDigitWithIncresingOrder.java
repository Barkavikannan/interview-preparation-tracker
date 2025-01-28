import java.util.ArrayList;

public class nDigitWithIncresingOrder {
     public static ArrayList<Integer> increasingNumbers(int n) {
       
         ArrayList<Integer> result = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                result.add(i);
            }
            return result;
        }
        
        generateNumbers(result, "", 1, n);
        return result;
    }
    
    private static void generateNumbers(ArrayList<Integer> result, String current, int start, int n) {
        if (current.length() == n) {
            result.add(Integer.parseInt(current));
            return;
        }
        
        for (int i = start; i <= 9; i++) {
            generateNumbers(result, current + i, i + 1, n);
        }
    }
    public static void main(String[] args) {
        System.out.println(increasingNumbers(2));
        }
        }
