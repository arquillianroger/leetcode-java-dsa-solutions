class Solution {
    public int addDigits(int num) {
        /*Brute Force Approach
        int sum = 0;
        while(num > 0)
        {
            sum += num % 10;
            num /= 10;
            if(num == 0 && sum >= 10)
            {
                num = sum;
                sum = 0;
            }
        }
        return sum;
        */
        /*Using Digital Root concept
Instead of looping to add digits over and over, you can use a simple math trick called the digital root.
Here’s the idea:
In base 10, every place value (10, 100, 1000…) leaves a remainder of 1 when divided by 9. So taking a number 
modulo 9 gives the same result as, Repeating that sum until one digit remains.
*/
        if(num == 0)
        return 0;
        else if(num % 9 == 0)
        return 9;
        else 
        return num % 9;
    }
}
