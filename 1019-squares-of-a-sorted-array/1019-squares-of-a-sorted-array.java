class Solution {
    public int[] sortedSquares(int[] nums) {
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