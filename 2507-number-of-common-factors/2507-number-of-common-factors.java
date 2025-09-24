class Solution {
    public int commonFactors(int a, int b) {
        // Euclidean Algortihm
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        int gcd = a;
        int count = 0;
        for(int i = 1; i * i <= gcd; i++){
            if(gcd % i == 0){
                count++;
                if(i != gcd / i)    count++;
            }
        }
        return count;
    }
}