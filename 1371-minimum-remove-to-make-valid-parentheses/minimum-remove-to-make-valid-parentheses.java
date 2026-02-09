class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] sArr = s.toCharArray();
        Stack<Integer> parenTrack = new Stack<>();
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == '(') parenTrack.push(i);
            if(sArr[i] == ')'){
                if(parenTrack.isEmpty()) sArr[i] = 'N';
                else if(sArr[parenTrack.peek()] == '('){
                    parenTrack.pop();
                } else {
                    sArr[i] = 'N';
                }
            }
        }
        while(!parenTrack.isEmpty()){
            sArr[parenTrack.pop()] = 'N';
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] != 'N')
            sb.append(sArr[i]);
        }
        return sb.toString();
    }
}