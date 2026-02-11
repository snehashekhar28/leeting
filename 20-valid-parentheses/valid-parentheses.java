class Solution {
    public boolean isValid(String s) {
        Stack<Character> validStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                validStack.push(s.charAt(i));
            }
            else if(!validStack.isEmpty()){
                if(s.charAt(i) == ')' && validStack.peek() == '('){
                        validStack.pop();
                }
                else if(s.charAt(i) == '}' && validStack.peek() == '{'){
                    validStack.pop();
                }
                else if(s.charAt(i) == ']' && validStack.peek() == '['){
                    validStack.pop();
                } else return false;
            }
            else return false;
        }
        if(!validStack.isEmpty()) return false;
        return true;
    }
}