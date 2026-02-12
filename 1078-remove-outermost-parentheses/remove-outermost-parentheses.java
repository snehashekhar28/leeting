class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        char[] sArr = s.toCharArray();
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == '('){
                if(depth != 0) sb.append(sArr[i]);
                depth++;
            } else {
                depth--;
                if(depth != 0) sb.append(sArr[i]);
            }
        }
        return sb.toString();
    }
}