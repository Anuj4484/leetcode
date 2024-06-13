class Solution {
    public String truncateSentence(String s, int k) {
        String [] arr = s.split(" ");
        String [] res = new String[k];
        for(int i=0;i<k;i++){
            res[i] = arr[i];
        }
        return String.join(" ",res);
    }
}