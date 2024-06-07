class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i=0;
        for(String s:operations){
            if(s.equals("X++") || s.equals("++X")){
                i++;
            }
            else{
                i--;
            }
        }
        return i;
    }
}