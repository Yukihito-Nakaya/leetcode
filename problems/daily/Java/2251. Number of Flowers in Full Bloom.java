class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
      int l = people.length;
      int[] res = new int[l];

      TreeMap<Integer,Integer> map = new TreeMap<>();
      for(int i = 0; i < flowers.length; i++){
          map.put(flowers[i][0],map.getOrDefault(flowers[i][0],0) + 1);
          map.put(flowers[i][1] + 1,map.getOrDefault(flowers[i][1] + 1,0)-1);
      }
      TreeMap<Integer,Integer> sum = new TreeMap<>();
      int c = 0;
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          c += entry.getValue();
          sum.put(entry.getKey(),c);
      }

      for(int i = 0; i < l; i++){
          Map.Entry<Integer,Integer> entry = sum.floorEntry(people[i]);
          if(entry != null){
              res[i] = entry.getValue();
          }
      }

      return res;
    }
}