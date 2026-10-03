class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int min;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if ( val <= min ) {
            min = val;
        }
        stack1.push(val);
    }
    
    public void pop() {
        int val = stack1.pop();
        if ( val == min ) {
            min = Integer.MAX_VALUE;
            while ( !stack1.isEmpty() ) {
                int temp = stack1.pop();
                min = Math.min(min, temp);
                stack2.push(temp);
            }

            while ( !stack2.isEmpty() ) {
                stack1.push(stack2.pop());
            }
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return min;
    }
}
