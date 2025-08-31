class Solution {
    public int maximumGap(int[] nums) {
        //Brute Force Approach : O(nlogn) --Sorting and Consecutive Difference
        int maxDifference = 0;
        if(nums.length < 2)
        return maxDifference;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            int difference = nums[i] - nums[i - 1];
            maxDifference = Math.max(difference, maxDifference);
        }
        //Optimized Approach : O(n) --Bucket Based
        return maxDifference;
    }
}
