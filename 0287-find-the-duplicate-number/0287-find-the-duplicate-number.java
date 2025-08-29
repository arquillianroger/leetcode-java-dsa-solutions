class Solution {
    public int findDuplicate(int[] nums) {
        /*Brute Force Approach : O(nlogn)
        Arrays.sort(nums); //Sorting the array then, searching for duplicates
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1])
                return nums[i];
        }
        return -1; // as the input guarantees one repeated element then, the flow will never reach here
        */
        /*Optimized Approach : O(n)
Since you can’t modify the input array and need constant extra space, the classic trick is to use Floyd’s Tortoise and Hare (Cycle Detection) algorithm.
Think of the array as a linked list where each index points to the value at that index. There must be a cycle because there’s a duplicate.
*/
        //Phase 1 : Move slow by one step at a time and fast by two steps at a time until they meet
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        //Phase 2 : Now, both  pointers have met, initialize any one pointer to start of the array . Now, move both by one step at a time. 
        //Where they meet again is the duplicate.
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow; 
    }
}
