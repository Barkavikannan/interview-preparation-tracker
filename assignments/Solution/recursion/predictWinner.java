public class predictWinner {
    public static  boolean predictTheWinner(int[] nums) {
        int start = 0;
       int end = nums.length - 1;
       int ans = function(start,end,0,nums);
       return ans>=0;
   }

   public static  int function(int start,int end,int turn,int[] nums){
       if(start>end) return 0;

       int ans = 0;

       if(turn%2==0){ // 
           int take_first = nums[start] + function(start+1,end,turn+1,nums);
           int take_last = nums[end] + function(start,end-1,turn+1,nums);
           ans = Math.max(take_first,take_last);
       }else{
           int take_first = -nums[start] + function(start+1,end,turn+1,nums);
           int take_last =  -nums[end] + function(start,end-1,turn+1,nums);
           ans = Math.min(take_first,take_last);
       }
       
       return ans;
    
}
public static void main(String[] args) {
    int[] nums = {1, 5,2 };
    System.out.println(predictTheWinner(nums));
}
}
