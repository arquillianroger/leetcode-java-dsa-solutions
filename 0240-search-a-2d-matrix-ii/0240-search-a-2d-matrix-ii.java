class Solution {
    // Optimized Aprroach : O(log(m + n))
    /*
    Staircase search Approach:
    1. Start at top-right corner: (row=0, col=n-1).
    2. Compare with target:
    -> If target == current → found.
    -> If target < current → move left (col--), because everything below is larger.
    -> If target > current → move down (row++), because everything to the left is smaller.
    */
    public boolean searchMatrix(int[][] matrix, int target) {
            int row = 0;
            int col = matrix[0].length - 1;
            while(row < matrix.length && col >= 0){
                if(target == matrix[row][col])    return true;
                else if(target > matrix[row][col])    row += 1;
                else    col -= 1;
            }
        return false;
    }
}