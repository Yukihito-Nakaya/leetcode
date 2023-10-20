class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanVal = new HashMap<>();
        romanVal.put('I',1);
        romanVal.put('V',5);
        romanVal.put('X',10);
        romanVal.put('L',50);
        romanVal.put('C',100);
        romanVal.put('D',500);
        romanVal.put('M',1000);
        int res = 0;
        int l = s.length();
        for(int i = l - 1; i >= 0; i--){
            int tent = romanVal.get(s.charAt(i));
            if(i < l - 1 && tent < romanVal.get(s.charAt(i + 1))){
                res -= tent;
            }else {
                res += tent;
            }
        }
        return res;
    }
}