class Solution {
    public String minRemoveToMakeValid(String s) {
        //char[] sArr = s.toCharArray();
        Stack<Integer> parenStack = new Stack<>();
        Set<Integer> incClose = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') parenStack.push(i);
            if(s.charAt(i) == ')'){
                if(parenStack.isEmpty()) incClose.add(i);
                else if(s.charAt(parenStack.peek()) == '('){
                    parenStack.pop();
                } else{
                    incClose.add(i);
                }
            }
        }
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(!parenStack.empty() || !incClose.isEmpty() || i >=0){
            if(!parenStack.empty() && parenStack.peek() == i){
                parenStack.pop();
                i--;
                continue;
            } 
            if(incClose.contains(i)){
                incClose.remove(i);
                i--;
                continue;
            }
            sb.insert(0, s.charAt(i));
            i--;
        }
        return sb.toString();
    }
}