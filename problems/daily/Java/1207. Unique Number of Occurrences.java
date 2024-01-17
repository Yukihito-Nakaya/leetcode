class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = arr.length;
        for(int i = 0; i< l; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values()); 
        for(int i = 0; i < list.size() - 1 ; i++){
            for(int k = i + 1; k < list.size(); j++){
                if(list.get(i).equals(list.get(k))){
                    return false;
                }
            }
        }
        return true;
    }
}

//another solution
class Solution {
    public boolean uniqueOccurrences(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}