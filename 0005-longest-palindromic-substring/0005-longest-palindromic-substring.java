class Solution {
    public String longestPalindrome(String s) {
        if ( s.length() < 1) {
            return s;
        }
        String longest = s.substring(0, 1);  
        int max  = 1;
        for(int i=0;i<s.length();i++){
            for(int j=i+max;j<=s.length();j++){
                if(j-i > max && ispalindrome(s.substring(i,j))){
                    max = j-i;
                    longest = s.substring(i,j);
                }
                
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