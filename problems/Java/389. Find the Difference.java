class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char i : s.toCharArray()) res ^= i;
        for(char k : t.toCharArray()) res ^= k;
        return res;
    }
}

//using XOR
//a~z__011000001～01111010
//
//res = 0 を初期値で置く理由はchar型の変数が初期化されていない場合、文字のXOR演算は、文字コードの数値表現として行われます。
//大文字と小文字のアルファベット文字の文字コードは異なるため、0で初期化しない場合、異なる文字列をビットが１として累積され、
//結果が大文字として返ってくるからです。