class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            for(int j=0;j<t.length();j++){
                char b = t.charAt(j);
                if(a == b){
                    sum+=Math.abs(i- j);
                }
            }
        }   
        return sum;
    }
}