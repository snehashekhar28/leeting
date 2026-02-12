class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        char[] sArr = s.toCharArray();
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == '('){
                if(depth == 0) sArr[i] = '.';
                depth++;
            } else {
                depth--;
                if(depth == 0) sArr[i] = '.';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : sArr){
            if(c!= '.') sb.append(c);
        }
        return sb.toString();
    }
}