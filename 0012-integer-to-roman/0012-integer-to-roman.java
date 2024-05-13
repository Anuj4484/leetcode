class Solution {
    public String intToRoman(int num) {
        String M[] = {"","M","MM","MMM"};
        String D[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String V[] = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};

        return M[num/1000]+D[(num%1000)/100]+X[(num%100)/10]+V[(num%10)/1];
    }
}