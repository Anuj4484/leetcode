class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<String>();
        for(String str : words){
            String temp = "";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) != separator){
                    temp += str.charAt(i);
                }
                else if(temp.isEmpty()){
                        continue;
                }
                else{
                    res.add(temp);
                    temp = "";
                }
            }
            if(!temp.isEmpty())
            res.add(temp);
        }
        return res;
    }
}