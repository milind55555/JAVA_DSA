import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
         int[] nums = {1, 2, 3, 4};
    int[] result = productExceptSelf(nums);
    System.out.println("Input: " + Arrays.toString(nums));
    System.out.println("Product Except Self: " + Arrays.toString(result));
    }
     public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Fill result with left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;
        
    }
}
