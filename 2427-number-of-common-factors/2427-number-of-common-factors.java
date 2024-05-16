class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int high = 0;
        if(a>b){
            high = a;
        }
        else{
            high = b;
        }
        for(int i=1;i<=high;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
        
    }
}