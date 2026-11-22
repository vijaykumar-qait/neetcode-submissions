class MovingAverage {
    int windowSum = 0;
    Queue<Integer> queue;
    int count = 0;
    int maxSize = 0;

    public MovingAverage(int size) {
        queue = new ArrayDeque<>(size);
        maxSize = size;
    }
    
    public double next(int val) {
        if (queue.size() < maxSize) {
            queue.add(val);
            windowSum += val;
            count++;
            return (windowSum*1.0)/count;
        }
        else {
            windowSum -= queue.poll();
            queue.add(val);
            windowSum += val;
            return (windowSum*1.0)/queue.size();
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
