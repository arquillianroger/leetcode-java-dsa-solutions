class Solution {
    // Brute Force Approach : O(n^2) time and O(n) space
    // Check each pair
    /*
    public int findPairs(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <  nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    List<Integer> pair = Arrays.asList(nums[i], nums[j]);
                    List<Integer> reverse = Arrays.asList(nums[j], nums[i]);

                    //ensuring unique pairs that is, pair order does not matter
                    if(!list.contains(pair) && !list.contains(reverse))
                        list.add(pair);
                }
            }
        }
        return list.size();
    }
    */
    // Better Approach : O(nlogn)
    // Sorting and Two Pointers Approach
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;
        while(left < nums.length && right < nums.length){
            // make sure right is always ahead of left
            if(left == right){
                right++;
                continue;
            }

            int diff = nums[right] - nums[left];

            if(diff < k) // need bigger difference
                right++;

            else if(diff > k) // need smaller difference
                left++;

            else{  // valid pair
                count++;
                left++;
                right++;
            }
            // skip duplicates for left
            while (left > 0 && left < nums.length && nums[left] == nums[left - 1])
            left++;
        }
        return count;
    }
}