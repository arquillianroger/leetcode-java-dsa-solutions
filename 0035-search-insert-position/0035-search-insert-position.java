class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) start = mid + 1;
            else    end = mid - 1;
            
        }
    // When the loop ends, start points to the correct insertion index:
    // If target is smaller than all → start = 0.
    // If target is larger than all → start = nums.length.
    // Otherwise → start is the position where target fits in order.
        return start;
    }
}