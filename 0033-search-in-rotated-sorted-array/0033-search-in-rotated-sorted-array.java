class Solution {
    // Intuition -> When minimum element is found then the subarrays on the left and right of min element are sorted so, we apply general binary search to one or both sides.
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
// if middle element is greater than the last element then the minimum element lies to the right else to the left
            if(nums[mid] > nums[end])    start = mid + 1;
            else end = mid;
        }
        // if minimum element is the target value
        if(target == nums[start])   return start;

        // search for target on right side of minimum elemenmt
        else if(target > nums[start] && target <= nums[nums.length - 1])
        return binarySearch(nums, start + 1, nums.length - 1, target);

        // search for target on left side of minimum elemenmt
        else    return binarySearch(nums, 0, start - 1, target);
    }
    int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])  return mid;
            else if(target > arr[mid])  start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}