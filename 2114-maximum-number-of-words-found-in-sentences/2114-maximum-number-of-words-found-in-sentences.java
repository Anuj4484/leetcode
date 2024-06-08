class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int max=0;
        for(int i=0;i<sentences.length;i++){
           count = Math.max(max,sentences[i].split(" ").length);
        }
        return count;
    }
}