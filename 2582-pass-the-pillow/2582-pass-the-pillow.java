class Solution {
    public int passThePillow(int n, int time) {
      if(time<n){
        return time+1;
      }
      int sl = n-1;
      int rem = time % sl;
      int i = time / sl;

      if((i & 1) == 1){
        return n - rem;
      }
      else{
        return rem + 1;
      }
     }
}