public class noOfSteps {
    public static int numberOfSteps(int num) {
            if(num==0){
                return 0;
            }
            if(num%2==0){
                return 1 +(numberOfSteps(num/2));
            }
            else{
                return 1 +(numberOfSteps(num-1));
            }
    
        }
        public static void main(String[] args) {
            int num=14;
            int result= numberOfSteps(num);
        System.out.println(result);
    
    }
    
}