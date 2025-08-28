class Solution {
    public void duplicateZeros(int[] arr) {
        int zerosToDuplicate = 0;
        int n = arr.length - 1;
        for (int i = 0; i <= n - zerosToDuplicate; i++) {
            if (arr[i] == 0) {
                // Edge case: If the current zero would be the last element we can process
                if (i == n - zerosToDuplicate) {
                    arr[n] = 0;
                    n -= 1;
                    // Special handling for the last zero
                    break;
                }
                zerosToDuplicate++;
            }
        }
        for(int i = n - zerosToDuplicate; i >= 0; i--) {
            if (arr[i] == 0 && zerosToDuplicate > 0) {
                arr[i + zerosToDuplicate] = arr[i];
                zerosToDuplicate -= 1;
                arr[i + zerosToDuplicate] = arr[i];
            } else {
                arr[i + zerosToDuplicate] = arr[i];
            }
        }
    }
}