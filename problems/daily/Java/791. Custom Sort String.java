class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        StringBuilder ans = new StringBuilder();
        for(char c: order.toCharArray()){
            if(map.containsKey(c)){
                int i = map.get(c);
                while(i-- > 0){
                    ans.append(c);
                }
                map.remove(c);
            }
        }

        for(char c: map.keySet()){
            int i = map.get(c);
            while(i-- > 0){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}