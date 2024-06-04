class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = "";
        String t = "";
        for(int i=0;i<word1.length;i++){
            s = s.concat(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            t =t.concat(word2[i]);
        }
        return (s.equals(t));
    }
}