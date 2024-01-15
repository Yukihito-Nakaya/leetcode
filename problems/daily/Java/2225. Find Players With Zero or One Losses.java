class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = matches.length;
        for(int i = 0; i < l; i++){
            if(!map.containsKey(matches[i][0])){
                map.put(matches[i][0], 0);
            }
            if(map.containsKey(matches[i][1])){
                map.put(matches[i][1], map.get(matches[i][1]) + 1);
            } else{
                map.put(matches[i][1], 1);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> winerList = new ArrayList<>();
        List<Integer> loserList = new ArrayList<>();

        for(int key : map.keySet()){
            if(map.get(key) == 0){
                winerList.add(key);
            } else if(map.get(key) == 1){
                loserList.add(key);
            }
        }
        Collections.sort(winerList);
        Collections.sort(loserList);
        ans.add(winerList);
        ans.add(loserList);
        return ans;
    }
}