public class powerOftwo {
    public static boolean power( int n) {
        if (n == 1) {
            return true;
        }
        if (n==0 || n%2!=0) {
            return false;
        }
        return power(n/2);
    }
    public static void main(String[] args) {
        int n = 16;
        if( power(n))
        System.out.println("true");
        else
        System.out.println("false");
    }
    
}
