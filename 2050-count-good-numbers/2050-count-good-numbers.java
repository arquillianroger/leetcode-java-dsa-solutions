class Solution {
    final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        // even index(5 choices) -- even number or more precisely even digits from 0 - 9 : 0, 2, 4, 6, 8
        // odd index(4 choices) -- prime number or more precisely one digit prime numbers from 0 - 9 : 2, 3, 5, 7
        // choices -> decision(which digit to include or exclude) -> Recursion
        long countEvenIndex = (n + 1)/ 2;
        long countOddIndex =  n / 2;
        
        // Even Index Contribution --5 choices per index
        long productEvenIndex = myPower(5, countEvenIndex);
        // Odd Index Contribution --4 choices per index
        long productOddIndex = myPower(4, countOddIndex);

        return (int)(productEvenIndex * productOddIndex % MOD);
    }
    // Binary or Fast Exponentiation using Recursion
    long myPower(int x, long n){
        // Base Case
        if(n == 0) return 1;

        // Recursive Call
        long value = myPower(x, n/2);

        // Induction Part
        if(n % 2 == 0)
            return value * value % MOD;
        else
            return value * value * x % MOD; 
    }
    // Binary or Fast Exponentiation using Loops
    
}