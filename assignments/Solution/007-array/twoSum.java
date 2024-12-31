import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoSum {
    public static int[] Sum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                    int[] result = new int[list.size()];
                    for (int k = 0; k < list.size(); k++) {
                        result[k] = list.get(k); 
                    }
                    return result;
                }
            }
        }
        return null;
        }
        public static void main(String[] args) {
            int[] num={2,7,11,15};
            int target=9;
            int[] result = Sum( num, target );
        System.out.println(Arrays.toString(result));
    }
    
}
