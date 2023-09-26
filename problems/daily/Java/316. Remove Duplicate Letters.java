class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:s.toCharArray()) map.put(i,map.getOrDefault(i,0)+1);

        Stack<Character> tent = new Stack<>();
        boolean[] azcheck = new boolean[26];

        for(char i: s.toCharArray()){
            map.put(i,map.get(i)-1);
            if(!azcheck[i-'a']){
                while(!tent.isEmpty() && tent.peek() > i && map.get(tent.peek()) > 0){
                    azcheck[tent.pop()-'a'] = false;
                }
            tent.push(i);
            azcheck[i-'a'] = true;
            }

        }

        System.out.println(tent);
        StringBuilder res = new StringBuilder();
        while(!tent.isEmpty()){
            res.insert(0,tent.pop());
        }
        return res.toString();
    }
}