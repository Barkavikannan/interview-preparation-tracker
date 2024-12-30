public class recursion {
    public static void printingnum(int n) {
       if (n==0){
        return;
       }
       
       System.out.println(n);

       printingnum(n-1);

    }
    public static void main(String[] args) {
        printingnum(5);
    }
    }
    
