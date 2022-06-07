class Solution {
    public String intToRoman(int num) {
        
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1} ; 
        String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        
        while (num > 0 ){
            for (int index = 0 ; index < values.length ; index ++){
                if (num >= values[index]) {
                    result = result + symbols[index];
                    num = num - values[index] ;
                    break;
                }
            }
            System.out.println(result);
        }
        return result;
        
    }
}
