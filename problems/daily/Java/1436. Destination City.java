class Solution {
    public String destCity(List<List<String>> paths) {
        String ans = "";
        HashMap<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (String key : map.keySet()) {
            if (!map.containsKey(map.get(key))) {
                ans = map.get(key);
                break;
            }
        }
        return ans;
    }
}