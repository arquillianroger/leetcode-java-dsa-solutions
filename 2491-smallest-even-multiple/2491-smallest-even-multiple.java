class Solution {
    public int smallestEvenMultiple(int n) {
        int max = Math.max(n, 2);
        int min = Math.min(n, 2);
        while(min != 0)
        {
            int temp = min;
            min = max % min;
            max = temp;
        }
        int lcm = (2 * n) / max;
        return lcm;
    }
}