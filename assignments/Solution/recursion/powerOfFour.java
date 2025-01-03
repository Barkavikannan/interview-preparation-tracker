public class powerOfFour {
        public static boolean power( int n) {
            if (n == 1) {
                return true;
            }
            if (n<=0 || n%4!=0) {
                return false;
            }
            return power(n/4);
        }
        public static void main(String[] args) {
            int n = 5;
            if( power(n))
            System.out.println("true");
            else
            System.out.println("false");
        }
        
    }
    
    

