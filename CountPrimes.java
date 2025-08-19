class Solution {
    public int countPrimes(int n) {
      /*Brute Force Approach : O(n * n)
        int count = 0;
        for(int num = 1; num < n; num++)
        {
            if(num > 1)
            { 
                boolean isPrime = true;
                for(int i = 2; i < num; i++)
                {
                    if(num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                count++;
            }
        }
        return count; 
        */

      /*Average Approach : O(n * sqrt(n))
      int count = 0;
        for(int num = 1; num < n; num++)
        {
            if(num > 1)
            { 
                boolean isPrime = true;
                for(int i = 2; i <= Math.sqrt(num); i++)
                {
                    if(num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                count++;
            }
        }
        return count; 
      */
      /*Using Sieve of Eratosthenes
      Best Approach : O(n * log(logn))
      */
    }
}
