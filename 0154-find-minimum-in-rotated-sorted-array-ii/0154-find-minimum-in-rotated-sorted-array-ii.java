class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
// if middle element is greater than the last element then the minimum element lies to the right else to the left
            if(nums[mid] > nums[end])    start = mid + 1;   // min in right half
            else if(nums[mid] < nums[end]) end = mid;   // min could be at mid or left half
            else end--; // nums[mid] == nums[end], shrink safely
        }
        return nums[start];
    }
}