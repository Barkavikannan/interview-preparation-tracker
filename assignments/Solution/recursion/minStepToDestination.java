public class minStepToDestination {
        public static int minSteps(int d) {
            // Initialize variables
            int steps = 0;
            int sum = 0;
    
            // Keep taking steps until sum is >= d and the difference (sum - d) is even
            while (sum < d || (sum - d) % 2 != 0) {
                steps++;
                sum += steps;
            }
    
            return steps;
        }
    public static void main(String[] args) {
        int d = 10;
        System.out.println( minSteps(d));
    }
    
    
}
