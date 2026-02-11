class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack <Integer> parenStack = new Stack <>();
        char[] sArr = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') parenStack.push(i);
            else if(s.charAt(i) == ')'){
                if(parenStack.isEmpty()) sArr[i] = '.';
                else if(s.charAt(parenStack.peek()) == '(') parenStack.pop();
            }
        }
        while(!parenStack.isEmpty()){
            sArr[parenStack.pop()] = '.';
        }
        StringBuilder sb = new StringBuilder();
        for(char v : sArr){
            if(v != '.') sb.append(v);
        }
        return sb.toString();
    }
}