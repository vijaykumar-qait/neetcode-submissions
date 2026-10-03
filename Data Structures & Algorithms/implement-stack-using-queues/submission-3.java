class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int top;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while ( queue1.size() > 0 ) {
            queue2.add( queue1.poll() );
        }
        top = x;
        queue1.add(x);
        while ( queue2.size() > 0 ) {
            queue1.add( queue2.poll() );
        }
    }
    
    public int pop() {
            while ( queue1.size() > 0 ) {
                queue2.add( queue1.poll() );
            }
            int removeElement = queue2.poll();
            if ( !queue2.isEmpty() ) {
                top = queue2.peek();
            }
            while ( queue2.size() > 0 ) {
                queue1.add( queue2.poll() );
            }
            return removeElement;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */