public class findNumWithEvenNumOfDigits {
    @SuppressWarnings("unused")
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int countDigits = 0;
            while ( num != 0) {
                int rem = num % 10;
                countDigits++;
                num = num / 10;    
            }
            if (countDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println( findNumbers(nums));
    }
    
}
