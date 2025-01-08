public class missingNumber {
    public static int missingNum(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            int correctIndex = nums[i] ;

            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j){
                return j;
        }
    }
        return nums.length;
    

    }
    public static void main(String[] args) {
        int [] nums = {0,2,5,4};
        System.out.println( missingNum(nums));

    }
    
}
