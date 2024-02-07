class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            int count = map.get(c);
            ans.append(new String(new char[count]).replace("\0",String.valueOf(c)));
        }
        return ans.toString();
    }
}