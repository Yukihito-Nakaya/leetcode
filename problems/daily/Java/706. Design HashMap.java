class MyHashMap {
    private static final int s = 1000;
    private List<int[]>[] map;
    public MyHashMap() {
        map = new ArrayList[s];
        for(int i = 0;i < s; i++){
            map[i]= new ArrayList<>();
        }
    }
    
    public void put(int key, int value) {
        int id = key % s;
        List<int[]> tent = map[id];
        for(int[] i:tent){
            if(i[0] == key){
                i[1] = value;
                return;
            }
        }
        tent.add(new int[]{key,value});
    }
    
    public int get(int key) {
        int id = key % s;
        List<int[]> tent = map[id];
        for(int[] i:tent){
            if(i[0] == key){
                return i[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int id = key % s;
        List<int[]>tent = map[id];
        for(int k = 0; k < tent.size();k++){
            int[] i = tent.get(k);
            if(i[0] == key){
                tent.remove(k);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */