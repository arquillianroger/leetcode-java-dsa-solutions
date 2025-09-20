class Solution {
    // Indexing: first element of a pair → even index, second element → odd index.
    // Once the single element appears, this pairing pattern breaks.
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // Make mid even for simple comparision
            if (mid % 2 == 1) mid--;

            // Pair is correct, single element is to the right
            if(nums[mid] == nums[mid + 1])  start = mid + 2;

            // Pair is broken, single element is at mid or left
            else end = mid;
        }
        return nums[start];
    }
}