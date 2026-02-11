class Solution {
    public int compress(char[] chars) {
        int charsIdx = 0;
        int startIdx = 0;
        for(int i = 0; i <= chars.length; i++){
            if(i == chars.length || chars[startIdx] != chars[i]){
                chars[charsIdx++] = chars[startIdx];
                if(i-startIdx > 1){
                    int diff = i - startIdx;
                    String numString = String.valueOf(diff);
                    for(char numChar : numString.toCharArray()){
                        chars[charsIdx++] = numChar;
                    }
                }
                startIdx = i;
            }
        }
        return charsIdx;
    }
}