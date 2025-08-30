class Solution {
    public int maxProduct(int[] nums) {
        /*Brute Force Approach : O(n^2) --Check Every Possible Subarray
        int productMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            productMax = Math.max(product, productMax);
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                productMax = Math.max(product, productMax);
            }
        }
        */
        /*Prefix and Suffix scan : O(n)
        1. Multiplying across an even number of negatives gives a positive (good).
        2. Multiplying across an odd number of negatives gives a negative (bad).
        3. Depending on where the “extra negative” lies (left or right), the max product might come from trimming the prefix or trimming the suffix.
        So, by scanning both left→right and right→left, we guarantee that we’ve considered both possibilities.
        */
        int currProduct = 1;
        int productMax = nums[0];
        //Scan 1 : Left to Right Scan
        for(int i = 0; i < nums.length; i++){
          currProduct *= nums[i];
          productMax = Math.max(currProduct, productMax);
          if(currProduct == 0)
            currProduct = 1;
        }

        currProduct = 1;
        //Scan 2 : Right to Left Scan
        for(int i = nums.length - 1; i >= 0; i--){
          currProduct *= nums[i];
          productMax = Math.max(currProduct, productMax);
          if(currProduct == 0)
            currProduct = 1;
        }
        return productMax;
    }
}