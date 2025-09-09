class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // When k > n
        k %= n;

        // Step 1: Reverse the subarray containing the last k elements of the array.
        reverse(nums, n - k, n - 1);

        // Step 2: Reverse the subarray containing the first (n - k) elements of the array.
        reverse(nums, 0, n - k - 1);

        // Step 3: Finally, reverse all the elements of the array.
        reverse(nums, 0, n - 1);
    }
    void reverse(int[] arr, int i, int j){
        while(i < j){
            int num = arr[i];
            arr[i++] = arr[j];
            arr[j--] = num;
        }
    }
}