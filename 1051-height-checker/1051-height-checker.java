class Solution {
    public int heightChecker(int[] heights) {
    int [] res = Arrays.sort(heights);
    int count = 0; 
      for(int i=0;i<heights.length;i++){
        if(heights[i] != res[i]){
            count++;
        }
    }
    return count;  
    }
}