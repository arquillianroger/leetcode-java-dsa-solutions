class Solution {
    public int[] sortedSquares(int[] nums) {
        /*Brute Force Approach : First, squaring the elements then, sorting the array which will take O(nlogn)
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
        */
        //Two Pointers Approach : O(n)
        int i = 0;
        int j = nums.length - 1;
        int k = j;
        int [] arr = new int [nums.length];
        while(i <= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                arr[k--] = nums[i] * nums[i];   
                i += 1;
            }
            else{
                arr[k--] = nums[j] * nums[j];
                j -= 1;
            }
        }
        return arr;
    }
}
