class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int c = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            if(ch == 'R'){
                rc++;
            }
            if(ch == 'L'){
                lc++;
            }
            if(lc == rc){
                c++;
                rc=0;
                lc=0;
            }
        }
        return c;
    }
}