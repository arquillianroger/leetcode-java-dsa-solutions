class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Target found
            if(target == nums[mid]) return true;

            // duplicates the, shrink the search space
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start +=1; 
                end -=1;
            }

            //when left half is sorted
            else if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]) 
                end = mid - 1; // search left
                else    start = mid + 1; // search right
            }
            //when right half is sorted
            else{
                if(target > nums[mid] && target <= nums[end])   
                start = mid + 1; // search right
                else end = mid - 1; // search left
            }
        }
        return false;
    }
}