class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        /* Brute Force Approach : O(n^2) --Nested Loops
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && !duplicates.contains(nums[i]))
                duplicates.add(nums[i]);
            }
        }
        */
        //Sorting Based Approach : O(nlogn)
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1] && !duplicates.contains(nums[i]))
            duplicates.add(nums[i]);
        }
        return duplicates;
    }
}