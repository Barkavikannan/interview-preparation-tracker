import java.util.ArrayList;
import java.util.List;

public class combination {
    public static List<List<Integer>> combSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combSumHelper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void combSumHelper(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index >= candidates.length) {
            return;
        }

        current.add(candidates[index]);
        combSumHelper(candidates, target - candidates[index], index, current, result);
        
        current.remove(current.size() - 1);
        combSumHelper(candidates, target, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println(combSum(candidates1, target1));

    }
}
    
