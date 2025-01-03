public class sumOfDigitsRecursion {
    public static int add(int n){
        if (n == 0) {
            return 0;
        }
        else {
            return (n % 10) + add(n / 10);
        }
    }
    public static void main(String[] args) {
        int num = 12345;
        int sum = add(num);
        System.out.println( sum);
    }
    
}
