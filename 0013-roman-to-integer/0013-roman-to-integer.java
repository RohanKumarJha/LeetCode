class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        if(len == 0) return 0;

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0;
        int val = 0;
        for(int i=0; i<len; i++) {
            char ch = s.charAt(i);
            int answer = map.get(ch);
            if(i == 0) {
                val = answer;
            } else {
                if(val < answer) {
                    val = answer-val;
                } else {
                    result += val;
                    val = answer;
                }
            }
        } 

        return result+val;
    }
}