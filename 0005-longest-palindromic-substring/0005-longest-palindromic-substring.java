class Solution {
    public String longestPalindrome(String s) {
        int longest =0;
        String longestString = 0;
        int longest  = 0;
        for(int i=0;i<s.length();i++){
           int l= i;
           int r = i;
           while(l>= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            if((r-l+1)> longest){
                longeststring = s.sunstring(l,r+1);
                longest = Math.max(longest,(r-l+1));
            }
            l--;
            r++;
           }

           int le= i;
           int re = i+1;
           while(le>= 0 && re<s.length() && s.charAt(le) == s.charAt(re)){
            if((re-le+1)> longest){
                longeststring = s.sunstring(le,re+1);
                longest = Math.max(longest,(re-le+1));
            }
            le--;
            re++;
           }
        }
        return longest;
    }
    public static boolean ispalindrome(String sub){
       int left = 0;
       int right = sub.length() - 1;
       while(left < right){
        if(sub.charAt(left)  != sub.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }

}