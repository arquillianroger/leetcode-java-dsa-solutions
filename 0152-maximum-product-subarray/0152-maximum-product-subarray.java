class Solution {
    public int maxProduct(int[] nums) {
        //Brute Force Approach : O(n^2) --Check Every Possible Subarray
        int productMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            productMax = Math.max(product, productMax);
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                productMax = Math.max(product, productMax);
            }
        }
        //
        return productMax;
    }
}