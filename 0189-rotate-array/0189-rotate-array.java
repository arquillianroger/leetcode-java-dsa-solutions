class Solution {
    // Brute Force Approach : O(k*n)
    /*
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // When k > n
        k %= n;

        // takes the last element, shifts all the elements to right by one place then, place the last element at the front
        while(k > 0){
            int num = nums[n - 1];
            for(int i = n - 1; i > 0; i--)
                nums[i] = nums[i - 1];
            nums[0] = num;
            k --;
        }    
    }
    */
  // Using Temporary array : O(n) time and O(n) space
  /*
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
  */
  // Reversal Algortihm --O(n) time and O(1) space : The idea is based on the observation that if we right rotate the array by k positions, 
    // the last k elements will be at the front and the first (n - k) elements will be at the end.
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
