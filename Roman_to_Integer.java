class Solution {
    public int romanToInt(String s) {
        int result = 0;
        HashMap <String, Integer> dictionary = new HashMap<String, Integer>();
        dictionary.put("I",1);
        dictionary.put("IV",4);
        dictionary.put("V",5);
        dictionary.put("IX",9);
        dictionary.put("X",10);
        dictionary.put("XL",40);
        dictionary.put("L",50);
        dictionary.put("XC",90);
        dictionary.put("C",100);
        dictionary.put("CD",400);
        dictionary.put("D",500);
        dictionary.put("CM",900);
        dictionary.put("M",1000);

        HashMap <String, Integer> frequency = new HashMap<String, Integer>();
        frequency.put("I",0);
        frequency.put("IV",0);
        frequency.put("V",0);
        frequency.put("IX",0);
        frequency.put("X",0);
        frequency.put("XL",0);
        frequency.put("L",0);
        frequency.put("XC",0);
        frequency.put("C",0);
        frequency.put("CD",0);
        frequency.put("D",0);
        frequency.put("CM",0);
        frequency.put("M",0);

        String arr[] = s.split("");
        Boolean lastSymbolChecked = false ;

        for (int i=0 ; i < arr.length-1 ; i ++) {
            
            if ( frequency.get(arr[i] +arr[i+1]) != null) {
                frequency.put( arr[i] +arr[i+1], frequency.get(arr[i] +arr[i+1]) +1 ) ;
                if (i == arr.length-2) {
                    lastSymbolChecked= true ;
                }
                i++;
            } else {
                frequency.put(arr[i] , frequency.get(arr[i]) +1 );   
            }
        }
        
        if (!lastSymbolChecked) {
            frequency.put(arr[arr.length-1] , frequency.get(arr[arr.length-1]) +1 );
        }

        for (String key : dictionary.keySet()) {
            result = result + dictionary.get(key) * frequency.get(key);
        }
        return result;
    }
    
}
