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
        //Using Digital Root concept
        if(num == 0)
        return 0;
        else if(num % 9 == 0)
        return 9;
        else 
        return num % 9;
    }
}