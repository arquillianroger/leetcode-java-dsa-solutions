class Solution {
    public boolean isHappy(int n) {
        while(true)
        {
            int squareSum = 0;
            while(n > 0)
            {
                squareSum += (int) Math.pow(n % 10 , 2);
                n /= 10;
            }
            n = squareSum;
            if(n == 1)
            return true;
            else if(n == 4)
            return false;
        }
    }
}