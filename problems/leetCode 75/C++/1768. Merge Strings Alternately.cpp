class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string merged = "";
        if(word1.size() > word2.size()){
            for(int i=0;i<word1.size();i++){
                merged+=word1[i];
                if(word2.size()>i){
                    merged+=word2[i];
                }else{
                    merged+="";
                }
            }
        }else{
            for(int i=0;i<word2.size();i++){
               if(word1.size()>i){
                   merged+=word1[i];
               }else{
                   merged+="";
               }
               merged+=word2[i];
            }
        }
        return merged;
    }
};