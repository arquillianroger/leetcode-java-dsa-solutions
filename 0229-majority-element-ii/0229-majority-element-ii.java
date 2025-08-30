class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*Brute Force Approach : O()
        Let’s say a, b, and c all appear more than ⌊n/3⌋ times.
        That means:
        freq(a) > n/3, freq(b) > n/3, freq(c) > n/3
        If you add them up: freq(a) + freq(b) + freq(c) > n
        But the array only has n elements total!
        Therefore: At most 2 elements can have frequency > ⌊n/3⌋.
        */
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int loopCounter = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            if(loopCounter <= 2) // As, At most 2 elements can have frequency > ⌊n/3⌋.
            {
                for(int j = 0; j < n; j++){
                    if(nums[i] == nums[j])
                    count ++;
                }
                if(count > Math.floor(n / 3) && !list.contains(nums[i])){
                    list.add(nums[i]);
                    loopCounter ++;
                }
            }
        }
        return list;
    }
}