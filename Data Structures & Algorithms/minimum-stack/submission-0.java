class MinStack {

    int min = Integer.MAX_VALUE;
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MinStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();    
    }
    
    public void push(int val) {
        min = Math.min(min, val);

        q2.add(val);
        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue temp = q2;
        q2 = q1;
        q1 = temp;
    }
    
    public void pop() {
        int val = q1.poll();
        if (val == min) {
            min = Integer.MAX_VALUE;
            while(!q1.isEmpty()) {
                int popVal = q1.poll();
                min = Math.min(min, popVal);
                q2.add(popVal);
            }

            while(!q2.isEmpty()) {
                q1.add(q2.poll());
            }
        }
    }
    
    public int top() {
        return q1.peek();
    }
    
    public int getMin() {
        return min;
    }
}
