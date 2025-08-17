class Solution {
    public int commonFactors(int a, int b) {
        byte loopRuns = 0;
        loopRuns = a > b ? (byte) Math.sqrt(a) : (byte) Math.sqrt(b)  ;
        int count = 0;
        for(int i = 1; i <= loopRuns; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                count += 1;
                int factor = Math.max(a, b) / i;
                if(factor == i)
                continue;
                else if(a % factor == 0 && b % factor == 0)
                count += 1;
            }
            else
            {
                int factor = Math.max(a, b) / i;
                if(a % factor == 0 && b % factor == 0)
                count += 1;
            }
        }
        return count;
    }
}
