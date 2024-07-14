class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int i = String.valueOf(n).length()-1;
        while(i >= 0){
            if(i % 2== 0){
                sum +=n % 10;
            }
            else
                sum -= n%10;
            n /= 10;
            i--;
        }
        return sum;
    }
}