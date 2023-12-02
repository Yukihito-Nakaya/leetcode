class Solution {
    public int countCharacters(String[] words, String chars) {
                int[] check = new int[26];
        for(int i = 0; i < chars.length(); i++){
            check[chars.charAt(i)-'a']++;
        }
        int ans = 0;
        for(String i: words){
            if(caceForm(i,check))ans += i.length();
        }
        return ans;
    }

    boolean caceForm(String word, int[] check){
        int[] counts = new int[26];
        for(int i = 0; i<word.length(); i++){
            int tent = word.charAt(i)-'a';
            counts[tent]++;
            if(counts[tent] > check[tent])return false;
        }
        return true;
    }
}