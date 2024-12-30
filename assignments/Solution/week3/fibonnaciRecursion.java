public class fibonnaciRecursion {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n==1) {
            return 0;
        }
        if(n==2){
            return 1;
        }
        int last = fib(n-1);
        int secondlast = fib(n-2);
    
    return last+ secondlast;
}
}
