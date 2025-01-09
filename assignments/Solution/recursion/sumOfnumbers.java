public class sumOfnumbers {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int result = n + sum(n-1);
        return result;        
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(sum(num));
    }
    
}
