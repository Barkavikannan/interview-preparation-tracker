import java.util.ArrayList;
import java.util.Arrays;

public class targetArrayInGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
            int[] result = new int[nums.length];
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i],nums[i]);
            }
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
    
        }
        public static void main(String[] args) {
            int[] nums={0,1,2,3,4};
            int[] index={0,1,2,2,1};
            System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }
    }
    

