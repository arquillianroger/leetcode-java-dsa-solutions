class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        /*Brute Force Approach : O(n^2)
        Let’s say a, b, and c all appear more than ⌊n/3⌋ times.
        That means: freq(a) > n/3, freq(b) > n/3, freq(c) > n/3
        If you add them up: freq(a) + freq(b) + freq(c) > n
        But the array only has n elements total!
        Therefore: At most 2 elements can have frequency > ⌊n/3⌋.
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
        return list;
    }
}
