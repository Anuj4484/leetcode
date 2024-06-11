class Solution {
    public int heightChecker(int[] heights) {
    int [] res = new int[heights.length];
    int count = 0; 

    for(int i=0;i<heights.length;i++){
        res[i] = heights[i];
    }

    for(int i=0;i<heights.length;i++){
        Arrays.sort(heights);
        if(heights[i] != res[i]){
            count++;
        }
    }
    return count;  
    }
}