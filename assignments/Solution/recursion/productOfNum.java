public class productOfNum {
    public static int product(int n) {
        if (n == 0) {
            return 1;
        }
        int result = n * product(n-1); 
        return result;
    }
    public static void main(String[] args) {
        int num = 3;
        System.out.println( product(num));
    }
    
}
