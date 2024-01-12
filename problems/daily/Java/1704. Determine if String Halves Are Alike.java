class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int c = 0;
        int min = s.length()/2;
        
        for(int i = 0; i < min; i++){
            if(vowels.contains(s.charAt(i)))c++;
            if(vowels.contains(s.charAt(i+min)))c--;
        }
        return c == 0;
    }
}