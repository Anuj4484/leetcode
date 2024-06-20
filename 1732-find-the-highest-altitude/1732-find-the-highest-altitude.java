class Solution {
    public int largestAltitude(int[] gain) {
        int c = 0;
        int h = 0;
        for(int i=0;i<gain.length;i++){
            c = c+gain[i];
            h = Math.max(c,h);
        }
        return h;
    }
}