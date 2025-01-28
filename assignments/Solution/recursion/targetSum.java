public class targetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        return calculate(nums, target, 0);
         }
        
         private static int calculate(int[] nums, int target, int index) {
     if (index == nums.length) {
         return target == 0 ? 1 : 0;
     }

     int add = calculate(nums, target - nums[index], index + 1);
     int subtract = calculate(nums, target + nums[index], index + 1);

     return add + subtract;
     
 }
public static void main(String[] args) {
    int [] nums = {1,1,1,1,1};
    int target = 3;
    System.out.println( findTargetSumWays( nums,target)) ;
}
    
}
