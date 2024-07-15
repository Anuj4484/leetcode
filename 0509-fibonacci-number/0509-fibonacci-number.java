class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if (n == 1) return 1;
        int l = 0;
        int ll=1;
        for(int i=0;i<n-1;i++){
            int temp = l + ll;
            l = ll;
            ll = temp;
        }
        return ll;
    }
}