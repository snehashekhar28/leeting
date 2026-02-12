class MinStack {
    Stack<Integer> minStack;
    int min;

    public MinStack() {
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val < min){
            min = val;
        }
        minStack.push(min);
        minStack.push(val);
        
    }
    
    public void pop() {
        minStack.pop();
        minStack.pop();
        if(minStack.isEmpty()) min = Integer.MAX_VALUE;
        else min = getMin();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        int temp = minStack.peek();
        minStack.pop();
        int getMin = minStack.peek();
        minStack.push(temp);
        return getMin;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */