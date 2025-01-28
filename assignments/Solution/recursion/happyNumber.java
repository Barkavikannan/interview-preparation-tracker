import java.util.HashSet;
import java.util.Set;

public class happyNumber {
    public static int nextHappy(int N) {
        return findNextHappy(N + 1);
    }

    private static int findNextHappy(int num) {
        if (isHappyNumber(num, new HashSet<>())) {
            return num;
        }
        return findNextHappy(num + 1);
    }

    private static boolean isHappyNumber(int num, Set<Integer> visited) {
        if (num == 1) return true; 
        if (visited.contains(num)) return false; 

        visited.add(num); 
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return isHappyNumber(sum, visited); 
    }

    public static void main(String[] args) {
        int N2 = 10;
        System.out.println("Next happy number after " + N2 + ": " + nextHappy(N2));
    }
}
