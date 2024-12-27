import java.util.Arrays;

public class concatinationOfArray {
    public static int[] getConcatenation(int[] nums) {
            int[] result = new int[nums.length * 2];
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i];
                
            }
            for( int i = 0; i < nums.length; i++ ){
                result[nums.length + i] = nums[i];
                }
                return result;
    
        }
        public static void main(String[] args) {
            int[] nums = {1, 2, 1};
            int[] result = getConcatenation(nums);
        System.out.println(" Result: " + Arrays.toString(result));

    }
    
}
