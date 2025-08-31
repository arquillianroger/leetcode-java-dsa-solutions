class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        /*Brute Force Approach : O(n^2)
        Let’s say a, b, and c all appear more than ⌊n/3⌋ times.
        That means:
        freq(a) > n/3, freq(b) > n/3, freq(c) > n/3
        If you add them up: freq(a) + freq(b) + freq(c) > n
        But the array only has n elements total!
        Therefore: At most 2 elements can have frequency > ⌊n/3⌋.
        int loopCounter = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j])
                    count ++;
            }
            if(count > n / 3 && !list.contains(nums[i]))// n/3 gives integer result so Math.floor() is not required
                list.add(nums[i]);
        }
        */
        /*Sorting Based Approach : O(nlogn)
        //First ask, if we can modify the order of elements then, only proceed with the approach
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) // Counts Frequency of each group
                count++;
            else{
                if (count > n / 3 && !list.contains(nums[i - 1]))
                list.add(nums[i - 1]);

                count = 1;
            }
        }
        if (count > n / 3 && !list.contains(nums[n - 1])) // checks for the last element, useful when all the elements of array are similar or array size is small
            list.add(nums[n - 1]);
        */
        //Optimised Approach : O(n) --Boyer-Moore Voting Algorithm
        return list;
    }
}
