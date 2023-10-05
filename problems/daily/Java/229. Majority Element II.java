class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int l = nums.length;
        int onT = l / 3;
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> tent = new HashMap<>();
        
        for(int i:nums){
            tent.put(i,tent.getOrDefault(i,0) + 1);
        }
        for(Map.Entry<Integer,Integer> k:tent.entrySet()){
            if(k.getValue() > onT){
                res.add(k.getKey());
            }
        }
        return res;
    }
}