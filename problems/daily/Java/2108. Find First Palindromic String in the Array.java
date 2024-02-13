class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(word.length() == 1){
                return word;
            }
            for(int i = 0; i < word.length() / 2; i++){
                if(word.charAt(i) != word.charAt(word.length()-1-i)){
                    break;
                }
                if(i == word.length()/2-1){
                    return word;
                }
            }
        }
        return "";
    }
}