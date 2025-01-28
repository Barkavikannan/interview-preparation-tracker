import java.util.ArrayList;
import java.util.List;

public class combinationThree {
     public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int k, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (k == 0 || n < 0) {
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(k - 1, n - i, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        
    }
}
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        System.out.println(combinationSum3(k, n));

    }
    

}

