class Solution {
    public String longestPalindrome(String s) {
        int longest =0;
        String longeststring = "";
        for(int i=0;i<s.length();i++){
           int l= i;
           int r = i;
           while(l>= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            if((r-l+1)> longest){
                longeststring = s.substring(l,r+1);
                longest = Math.max(longest,(r-l+1));
            }
            l--;
            r++;
           }

           int le= i;
           int re = i+1;
           while(le>= 0 && re<s.length() && s.charAt(le) == s.charAt(re)){
            if((re-le+1)> longest){
                longeststring = s.substring(le,re+1);
                longest = Math.max(longest,(re-le+1));
            }
            le--;
            re++;
           }
        }
        return longeststring;
    }
   

}