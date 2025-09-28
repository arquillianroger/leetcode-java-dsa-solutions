class Solution {
    // Brute Force : O(mlogn)
    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int m = 0; m < matrix.length; m++){
            int n = matrix[m].length;
            int start = 0;
            int end = n - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(target == matrix[m][mid])    return true;
                else if(target > matrix[m][mid])    start = mid + 1;
                else    end = mid - 1;
            }
        }
        return false;
    }
    */
    // Optimized Aprroach : O(log(m * n))
    // Intuition : As the first integer of each row is greater than the last integer of the previous row this implies, we can consider the matrix as a big sorted array
    // Flatten Index : matrix[mid / n][mid % n]; to know the mid value according to the index of matrix
    public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int start = 0;
            int end = m * n - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(target == matrix[mid / n][mid % n])    return true;
                else if(target > matrix[mid / n][mid % n])    start = mid + 1;
                else    end = mid - 1;
            }
        return false;
    }
}