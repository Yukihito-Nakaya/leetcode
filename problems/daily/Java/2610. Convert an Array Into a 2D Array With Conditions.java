class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        while(!map.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            List<Integer> temp2 = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                int k = entry.getKey();
                int v = entry.getValue();
                temp.add(k);
                v--;
                if(v == 0){
                    temp2.add(k);
                }
                map.put(k,v);
            }
            ans.add(temp);
            for(int i: temp2){
                map.remove(i);
            }
        }
        return ans;
    }
}