class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // When k > n
        k %= n;

        int[] temp = new int[n];

        // copy last k elemnents to the front of temp array
        for(int i = 0; i < k; i++)
            temp[i] = nums[n - k + i];
        
        // copy first n - k elemnents to the last of temp array
        for(int i = k; i < n; i++)
            temp[i] = nums[i - k];

        // Copying the elements of temp in arr to get the final rotated array
        for(int i = 0; i < n; i++)
            nums[i] = temp[i];
    }
}