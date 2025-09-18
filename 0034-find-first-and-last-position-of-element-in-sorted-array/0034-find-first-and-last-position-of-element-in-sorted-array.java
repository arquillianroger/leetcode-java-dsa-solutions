class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // To find the first occurrence (keep moving left when you see target).
        result[0] = binarySearch(nums, target, 0);

        // To find the last occurrence (keep moving right when you see target).
        result[1] = binarySearch(nums, target, 1);

        return result;
    }
    
    int binarySearch(int[] nums, int target, int i){
        int res = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                res = mid;
                if(i == 0)  end = mid - 1;  // keep searching left
                else start = mid + 1; // keep searching right
            }
            else if(target > nums[mid])   start = mid + 1;
            else end = mid - 1;
        }
        return res;
    }
}