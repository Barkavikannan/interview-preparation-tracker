public class checkingPrme {
    public static boolean Prime( int n, int i) {
        if (n <= 2) {
            return n== 2? true : false;
        }
        if(n % i == 0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return Prime(n, i+1);
    }
    public static void main(String[] args) {
        int n = 11;
        if( Prime(n , 2))
        System.out.println(" it a prime number");
        else 
        System.out.println(" it is not a prime number");
    }
    
}
