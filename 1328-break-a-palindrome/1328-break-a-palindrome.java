class Solution {
    public String breakPalindrome(String palindrome) {
        char [] arr = palindrome.toCharArray();
        if(arr.length<2){
            return "";
        }

        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != 'a'){
                arr[i]='a';
                return String.valueOf(arr);
            }
        }
        arr[arr.length-1]='a';
        return String.valueOf(arr);
    }
}