import java.util.Arrays;

public class shuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] shuffled = shuffle(arr, n);
        System.out.println("The result is: " + Arrays.toString(shuffled));
    }
}