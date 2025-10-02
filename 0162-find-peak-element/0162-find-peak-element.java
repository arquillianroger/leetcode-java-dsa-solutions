class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1 || nums[0] > nums[1])  return 0;
        if(nums[n - 1] > nums[n - 2]) return n - 1;
        // if start = 0 then, mid - 1 = -1, index out of bound
        int start = 1; 
        // if end = n - 1 then, mid + 1 = n, index out of bound
        int end = n - 2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // When mid itself is the peak element
            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
            return mid;
            // When peak element is somewhere in the right half
            else if(nums[mid + 1] > nums[mid])
            start = mid + 1;
            // When peak element is on the left half or otherwise
            else end = mid - 1;
        }
        return -1;
    }
}